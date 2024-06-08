class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * data is uninitialized
             */
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            for (int j = 0; j < 1; j++)
            {
                if (data != null)
                {
                    String names[] = data.split("-");
                    int successCount = 0;
                    Connection dbConnection = null;
                    Statement sqlStatement = null;
                    try
                    {
                        dbConnection = IO.getDBConnection();
                        sqlStatement = dbConnection.createStatement();
                        for (int i = 0; i < names.length; i++)
                        {
                            /* POTENTIAL FLAW: data concatenated into SQL statement used in executeBatch(), which could result in SQL Injection */
                            sqlStatement.addBatch("update users set hitcount=hitcount+1 where name='" + names[i] + "'");
                        }
                        int resultsArray[] = sqlStatement.executeBatch();
                        for (int i = 0; i < names.length; i++)
                        {
                            if (resultsArray[i] > 0)
                            {
                                successCount++;
                            }
                        }
                        IO.writeLine("Succeeded in " + successCount + " out of " + names.length + " queries.");
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
                            IO.logger.log(Level.WARNING, "Error closing Statament", exceptSql);
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
        }
};