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
                Connection dbConnection = null;
                Statement sqlStatement = null;
                ResultSet resultSet = null;
                try
                {
                    dbConnection = IO.getDBConnection();
                    sqlStatement = dbConnection.createStatement();
                    /* POTENTIAL FLAW: data concatenated into SQL statement used in executeQuery(), which could result in SQL Injection */
                    resultSet = sqlStatement.executeQuery("select * from users where name='"+data+"'");
                    IO.writeLine(resultSet.getRow()); /* Use ResultSet in some way */
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
                }
                finally
                {
                    try
                    {
                        if (resultSet != null)
                        {
                            resultSet.close();
                        }
                    }
                    catch (SQLException exceptSql)
                    {
                        IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
                    }
    
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