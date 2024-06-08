class bad_class{
    public void bad() throws Throwable
        {
            String dataCopy;
            {
                String data;
    
                /* get system property user.home */
                /* POTENTIAL FLAW: Read data from a system property */
                data = System.getProperty("user.home");
    
                dataCopy = data;
            }
            {
                String data = dataCopy;
    
                Connection dbConnection = null;
    
                try
                {
                    dbConnection = IO.getDBConnection();
    
                    /* POTENTIAL FLAW: Set the catalog name with the value of data
                     * allowing a nonexistent catalog name or unauthorized access to a portion of the DB */
                    dbConnection.setCatalog(data);
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
                }
                finally
                {
                    try
                    {
                        if (dbConnection != null)
                        {
                            dbConnection.close();
                        }
                    }
                    catch (SQLException exceptSql)
                    {
                        IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
                    }
                }
    
            }
        }
};