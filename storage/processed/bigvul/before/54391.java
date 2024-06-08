class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int data;
            if (IO.STATIC_FINAL_FIVE==5)
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
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (IO.STATIC_FINAL_FIVE!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: test for a zero modulus */
                if (data != 0)
                {
                    IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
                }
                else
                {
                    IO.writeLine("This would result in a modulo by zero");
                }
    
            }
        }
};