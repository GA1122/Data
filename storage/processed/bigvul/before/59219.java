class bad_class{
    public void bad() throws Throwable
        {
            int count;
            if(IO.staticReturnsTrueOrFalse())
            {
                count = Integer.MIN_VALUE; /* Initialize count */
                /* Read count from a database */
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
                        /* POTENTIAL FLAW: Read count from a database query resultset */
                        String stringNumber = resultSet.getString(1);
                        if (stringNumber != null) /* avoid NPD incidental warnings */
                        {
                            try
                            {
                                count = Integer.parseInt(stringNumber.trim());
                            }
                            catch (NumberFormatException exceptNumberFormat)
                            {
                                IO.logger.log(Level.WARNING, "Number format exception parsing count from string", exceptNumberFormat);
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
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                count = 2;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                int i = 0;
                /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
                for (i = 0; i < count; i++)
                {
                    IO.writeLine("Hello");
                }
            }
            else
            {
    
                int i = 0;
    
                /* FIX: Validate count before using it as the for loop variant */
                if (count > 0 && count <= 20)
                {
                    for (i = 0; i < count; i++)
                    {
                        IO.writeLine("Hello");
                    }
                }
    
            }
        }
};