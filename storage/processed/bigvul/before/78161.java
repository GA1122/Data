class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data;
    
            switch (6)
            {
            case 6:
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
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
                break;
            }
    
            switch (8)
            {
            case 7:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            default:
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
                break;
            }
        }
};