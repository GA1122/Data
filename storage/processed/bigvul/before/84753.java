class bad_class{
    public void bad() throws Throwable
        {
            String data;
            if (PRIVATE_STATIC_FINAL_FIVE == 5)
            {
                data = ""; /* Initialize data */
                /* retrieve the property */
                {
                    Properties properties = new Properties();
                    FileInputStream streamFileInput = null;
                    try
                    {
                        streamFileInput = new FileInputStream("../common/config.properties");
                        properties.load(streamFileInput);
                        /* POTENTIAL FLAW: Read data from a .properties file */
                        data = properties.getProperty("data");
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                    }
                    finally
                    {
                        /* Close stream reading object */
                        try
                        {
                            if (streamFileInput != null)
                            {
                                streamFileInput.close();
                            }
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
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