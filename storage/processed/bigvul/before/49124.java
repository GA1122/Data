class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            String password;
            if (PRIVATE_STATIC_FINAL_FIVE==5)
            {
                /* FIX: Use a hardcoded password as the password (it was not sent over the network) */
                /* INCIDENTAL FLAW: CWE-259 Hard Coded Password */
                password = "Password1234!";
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure password is inititialized before the Sink to avoid compiler errors */
                password = null;
            }
    
            if (PRIVATE_STATIC_FINAL_FIVE==5)
            {
                Connection connection = null;
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;
                try
                {
                    /* POTENTIAL FLAW: use password directly in getConnection() */
                    connection = DriverManager.getConnection("data-url", "root", password);
                    preparedStatement = connection.prepareStatement("select * from test_table");
                    resultSet = preparedStatement.executeQuery();
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Error with database connection", exceptSql);
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
                        if (preparedStatement != null)
                        {
                            preparedStatement.close();
                        }
                    }
                    catch (SQLException exceptSql)
                    {
                        IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql);
                    }
    
                    try
                    {
                        if (connection != null)
                        {
                            connection.close();
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