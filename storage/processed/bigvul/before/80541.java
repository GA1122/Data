class goodB2G2Sink_class{
    public void goodB2G2Sink(String data ) throws Throwable
        {
            if (CWE89_SQL_Injection__listen_tcp_executeBatch_22a.goodB2G2PublicStatic)
            {
                if (data != null)
                {
                    String names[] = data.split("-");
                    int successCount = 0;
                    Connection dbConnection = null;
                    PreparedStatement sqlStatement = null;
                    try
                    {
                        /* FIX: Use prepared statement and executeBatch (properly) */
                        dbConnection = IO.getDBConnection();
                        sqlStatement = dbConnection.prepareStatement("update users set hitcount=hitcount+1 where name=?");
                        for (int i = 0; i < names.length; i++)
                        {
                            sqlStatement.setString(1, names[i]);
                            sqlStatement.addBatch();
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
                            IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql);
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
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
        }
};