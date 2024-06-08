class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            while (true)
            {
                data = Integer.MIN_VALUE; /* Initialize data */
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
                        String stringNumber = resultSet.getString(1);
                        if (stringNumber != null) /* avoid NPD incidental warnings */
                        {
                            try
                            {
                                data = Integer.parseInt(stringNumber.trim());
                            }
                            catch (NumberFormatException exceptNumberFormat)
                            {
                                IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                            }
                        }
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
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: Zero modulus will cause an issue.  An integer division will
                result in an exception.  */
                IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
                break;
            }
        }
};