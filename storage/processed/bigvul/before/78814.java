class badSink_class{
    public void badSink(byte[] dataSerialized ) throws Throwable
        {
            /* unserialize data */
            ByteArrayInputStream streamByteArrayInput = null;
            ObjectInputStream streamObjectInput = null;
    
            try
            {
                streamByteArrayInput = new ByteArrayInputStream(dataSerialized);
                streamObjectInput = new ObjectInputStream(streamByteArrayInput);
                String data = (String)streamObjectInput.readObject();
    
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
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "IOException in deserialization", exceptIO);
            }
            catch (ClassNotFoundException exceptClassNotFound)
            {
                IO.logger.log(Level.WARNING, "ClassNotFoundException in deserialization", exceptClassNotFound);
            }
            finally
            {
                /* clean up stream reading objects */
                try
                {
                    if (streamObjectInput != null)
                    {
                        streamObjectInput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing ObjectInputStream", exceptIO);
                }
    
                try
                {
                    if (streamByteArrayInput != null)
                    {
                        streamByteArrayInput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing ByteArrayInputStream", exceptIO);
                }
            }
        }
};