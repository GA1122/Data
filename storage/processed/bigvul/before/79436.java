class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded string */
            data = "foo";
    
            for (int j = 0; j < 1; j++)
            {
                Connection dbConnection = null;
                PreparedStatement sqlStatement = null;
                try
                {
                    /* POTENTIAL FLAW: data concatenated into SQL statement used in prepareStatement() call, which could result in SQL Injection */
                    dbConnection = IO.getDBConnection();
                    sqlStatement = dbConnection.prepareStatement("insert into users (status) values ('updated') where name='"+data+"'");
                    Boolean result = sqlStatement.execute();
                    if (result)
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