class bad_class{
    public void bad() throws Throwable
        {
            String dataCopy;
            {
                String data;
    
                data = ""; /* Initialize data */
    
                {
                    InputStreamReader readerInputStream = null;
                    BufferedReader readerBuffered = null;
    
                    /* read user input from console with readLine */
                    try
                    {
                        readerInputStream = new InputStreamReader(System.in, "UTF-8");
                        readerBuffered = new BufferedReader(readerInputStream);
    
                        /* POTENTIAL FLAW: Read data from the console using readLine */
                        data = readerBuffered.readLine();
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                    }
                    finally
                    {
                        try
                        {
                            if (readerBuffered != null)
                            {
                                readerBuffered.close();
                            }
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                        }
    
                        try
                        {
                            if (readerInputStream != null)
                            {
                                readerInputStream.close();
                            }
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                        }
                    }
                }
                /* NOTE: Tools may report a flaw here because buffread and isr are not closed.  Unfortunately, closing those will close System.in, which will cause any future attempts to read from the console to fail and throw an exception */
    
                dataCopy = data;
            }
            {
                String data = dataCopy;
    
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
        }
};