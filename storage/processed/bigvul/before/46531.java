class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            data = ""; /* Initialize data */
    
            /* Read data from a database */
            {
                Connection connection = null;
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;
    
                try
                {
                    /* setup the connection */
                    connection = IO.getDBConnection();
    
                    /* prepare and execute a (hardcoded) query */
                    preparedStatement = connection.prepareStatement("select name from users where id=0");
                    resultSet = preparedStatement.executeQuery();
    
                    /* POTENTIAL FLAW: Read data from a database query resultset */
                    data = resultSet.getString(1);
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Error with SQL statement", exceptSql);
                }
                finally
                {
                    /* Close database objects */
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
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE23_Relative_Path_Traversal__database_66b()).badSink(dataArray  );
        }
};