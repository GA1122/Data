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
                Statement sqlStatement = null;
    
                try
                {
                    dbConnection = IO.getDBConnection();
                    sqlStatement = dbConnection.createStatement();
    
                    /* POTENTIAL FLAW: data concatenated into SQL statement used in execute(), which could result in SQL Injection */
                    Boolean result = sqlStatement.execute("insert into users (status) values ('updated') where name='"+data+"'");
    
                    if(result)
                    {
                        IO.writeLine("Name, " + data + ", updated successfully");
                    }
                    else
                    {
                        IO.writeLine("Unable to update records for user: " + data);
                    }
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
                }
                finally
                {
                    try
                    {
                        if (sqlStatement != null)
                        {
                            sqlStatement.close();
                        }
                    }
                    catch (SQLException exceptSql)
                    {
                        IO.logger.log(Level.WARNING, "Error closing Statement", exceptSql);
                    }
    
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