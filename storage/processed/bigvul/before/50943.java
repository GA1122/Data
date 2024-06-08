class bad_class{
    public void bad() throws Throwable
        {
            float data;
            if(IO.staticReturnsTrueOrFalse())
            {
                data = -1.0f; /* Initialize data */
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
                        if (stringNumber != null)
                        {
                            try
                            {
                                data = Float.parseFloat(stringNumber.trim());
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
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't a divide by zero */
                data = 2.0f;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Possibly divide by zero */
                int result = (int)(100.0 / data);
                IO.writeLine(result);
            }
            else
            {
    
                /* FIX: Check for value of or near zero before dividing */
                if (Math.abs(data) > 0.000001)
                {
                    int result = (int)(100.0 / data);
                    IO.writeLine(result);
                }
                else
                {
                    IO.writeLine("This would result in a divide by zero");
                }
    
            }
        }
};