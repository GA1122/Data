class badSink_class{
    public void badSink(byte[] dataSerialized ) throws Throwable
        {
            /* unserialize data */
            ByteArrayInputStream streamByteArrayInput = null;
            ObjectInputStream streamObjectInput = null;
    
            try
            {
                streamByteArrayInput = new ByteArrayInputStream(dataSerialized);
                streamObjectInput = new ObjectInputStream(streamByteArrayInput);
                String data = (String)streamObjectInput.readObject();
    
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
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "IOException in deserialization", exceptIO);
            }
            catch (ClassNotFoundException exceptClassNotFound)
            {
                IO.logger.log(Level.WARNING, "ClassNotFoundException in deserialization", exceptClassNotFound);
            }
            finally
            {
                /* clean up stream reading objects */
                try
                {
                    if (streamObjectInput != null)
                    {
                        streamObjectInput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing ObjectInputStream", exceptIO);
                }
    
                try
                {
                    if (streamByteArrayInput != null)
                    {
                        streamByteArrayInput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing ByteArrayInputStream", exceptIO);
                }
            }
        }
};