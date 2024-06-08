class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data;
            if (PRIVATE_STATIC_FINAL_FIVE==5)
            {
                /* get system property user.home */
                /* POTENTIAL FLAW: Read data from a system property */
                data = System.getProperty("user.home");
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (PRIVATE_STATIC_FINAL_FIVE!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                Connection dbConnection = null;
                PreparedStatement sqlStatement = null;
    
                try
                {
                    /* FIX: Use prepared statement and executeUpdate (properly) */
                    dbConnection = IO.getDBConnection();
                    sqlStatement = dbConnection.prepareStatement("insert into users (status) values ('updated') where name=?");
                    sqlStatement.setString(1, data);
    
                    int rowCount = sqlStatement.executeUpdate();
    
                    IO.writeLine("Updated " + rowCount + " rows successfully.");
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
};