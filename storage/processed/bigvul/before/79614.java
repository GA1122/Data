class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * data is uninitialized
             */
    
            data = ""; /* Initialize data */
            {
                File file = new File("C:\\data.txt");
                FileInputStream streamFileInput = null;
                InputStreamReader readerInputStream = null;
                BufferedReader readerBuffered = null;
    
                try
                {
                    /* read string from file into data */
                    streamFileInput = new FileInputStream(file);
                    readerInputStream = new InputStreamReader(streamFileInput, "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
    
                    /* POTENTIAL FLAW: Read data from a file */
                    /* This will be reading the first "line" of the file, which
                     * could be very long if there are little or no newlines in the file */
                    data = readerBuffered.readLine();
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                finally
                {
                    /* Close stream reading objects */
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
    
            for (int j = 0; j < 1; j++)
            {
                if (data != null)
                {
                    String names[] = data.split("-");
                    int successCount = 0;
                    Connection dbConnection = null;
                    Statement sqlStatement = null;
                    try
                    {
                        dbConnection = IO.getDBConnection();
                        sqlStatement = dbConnection.createStatement();
                        for (int i = 0; i < names.length; i++)
                        {
                            /* POTENTIAL FLAW: data concatenated into SQL statement used in executeBatch(), which could result in SQL Injection */
                            sqlStatement.addBatch("update users set hitcount=hitcount+1 where name='" + names[i] + "'");
                        }
                        int resultsArray[] = sqlStatement.executeBatch();
                        for (int i = 0; i < names.length; i++)
                        {
                            if (resultsArray[i] > 0)
                            {
                                successCount++;
                            }
                        }
                        IO.writeLine("Succeeded in " + successCount + " out of " + names.length + " queries.");
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
                            IO.logger.log(Level.WARNING, "Error closing Statament", exceptSql);
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
        }
};