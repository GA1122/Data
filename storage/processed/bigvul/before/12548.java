class goodB2G_class{
    private void goodB2G() throws Throwable
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
    
            if(IO.staticReturnsTrueOrFalse())
            {
                if (data != null)
                {
                    /* FIX: explicitly defined string formatting */
                    System.out.printf("%s%n", data);
                }
            }
            else
            {
    
                if (data != null)
                {
                    /* FIX: explicitly defined string formatting */
                    System.out.printf("%s%n", data);
                }
    
            }
        }
};