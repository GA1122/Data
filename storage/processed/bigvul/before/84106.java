class bad_class{
    public void bad() throws Throwable
        {
            String data;
            if (IO.staticTrue)
            {
                data = ""; /* Initialize data */
                /* Read data using an outbound tcp connection */
                {
                    Socket socket = null;
                    BufferedReader readerBuffered = null;
                    InputStreamReader readerInputStream = null;
                    try
                    {
                        /* Read data using an outbound tcp connection */
                        socket = new Socket("host.example.org", 39544);
                        /* read input from socket */
                        readerInputStream = new InputStreamReader(socket.getInputStream(), "UTF-8");
                        readerBuffered = new BufferedReader(readerInputStream);
                        /* POTENTIAL FLAW: Read data using an outbound tcp connection */
                        data = readerBuffered.readLine();
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                    }
                    finally
                    {
                        /* clean up stream reading objects */
                        try
                        {
                            if (readerBuffered != null)
                            {
                                readerBuffered.close();
                            }
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                        }
    
                        try
                        {
                            if (readerInputStream != null)
                            {
                                readerInputStream.close();
                            }
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                        }
    
                        /* clean up socket objects */
                        try
                        {
                            if (socket != null)
                            {
                                socket.close();
                            }
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                        }
                    }
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            Hashtable<String, String> environmentHashTable = new Hashtable<String, String>();
            environmentHashTable.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
            environmentHashTable.put(Context.PROVIDER_URL, "ldap://localhost:389");
            DirContext directoryContext = null;
    
            try
            {
                directoryContext = new InitialDirContext(environmentHashTable);
                /* POTENTIAL FLAW: data concatenated into LDAP search, which could result in LDAP Injection */
                String search = "(cn=" + data + ")";
    
                NamingEnumeration<SearchResult> answer = directoryContext.search("", search, null);
                while (answer.hasMore())
                {
                    SearchResult searchResult = answer.next();
                    Attributes attributes = searchResult.getAttributes();
                    NamingEnumeration<?> allAttributes = attributes.getAll();
                    while (allAttributes.hasMore())
                    {
                        Attribute attribute = (Attribute) allAttributes.next();
                        NamingEnumeration<?> allValues = attribute.getAll();
                        while(allValues.hasMore())
                        {
                            IO.writeLine(" Value: " + allValues.next().toString());
                        }
                    }
                }
            }
            catch (NamingException exceptNaming)
            {
                IO.logger.log(Level.WARNING, "The LDAP service was not found or login failed.", exceptNaming);
            }
            finally
            {
                if (directoryContext != null)
                {
                    try
                    {
                        directoryContext.close();
                    }
                    catch (NamingException exceptNaming)
                    {
                        IO.logger.log(Level.WARNING, "Error closing DirContext", exceptNaming);
                    }
                }
            }
    
        }
};