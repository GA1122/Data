class bad_class{
    public void bad() throws Throwable
        {
            String password = (new CWE319_Cleartext_Tx_Sensitive_Info__connect_tcp_driverManager_61b()).badSource();
    
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
};