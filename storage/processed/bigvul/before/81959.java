class bad_class{
    public void bad() throws Throwable
        {
            String data;
            if(IO.staticReturnsTrueOrFalse())
            {
                data = ""; /* Initialize data */
                /* retrieve the property */
                {
                    Properties properties = new Properties();
                    FileInputStream streamFileInput = null;
                    try
                    {
                        streamFileInput = new FileInputStream("../common/config.properties");
                        properties.load(streamFileInput);
                        /* POTENTIAL FLAW: Read data from a .properties file */
                        data = properties.getProperty("data");
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                    }
                    finally
                    {
                        /* Close stream reading object */
                        try
                        {
                            if (streamFileInput != null)
                            {
                                streamFileInput.close();
                            }
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                        }
                    }
                }
            }
            else
            {
    
                /* FIX: Use a hardcoded string */
                data = "foo";
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                Connection dbConnection = null;
                Statement sqlStatement = null;
                try
                {
                    dbConnection = IO.getDBConnection();
                    sqlStatement = dbConnection.createStatement();
                    /* POTENTIAL FLAW: data concatenated into SQL statement used in execute(), which could result in SQL Injection */
                    Boolean result = sqlStatement.execute("insert into users (status) values ('updated') where name='"+data+"'");
                    if(result)
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
            else
            {
    
                Connection dbConnection = null;
                PreparedStatement sqlStatement = null;
    
                try
                {
                    /* FIX: Use prepared statement and execute (properly) */
                    dbConnection = IO.getDBConnection();
                    sqlStatement = dbConnection.prepareStatement("insert into users (status) values ('updated') where name=?");
                    sqlStatement.setString(1, data);
    
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