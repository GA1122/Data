class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            data = Integer.MIN_VALUE; /* Initialize data */
    
            /* retrieve the property */
            {
                Properties properties = new Properties();
                FileInputStream streamFileInput = null;
    
                try
                {
                    streamFileInput = new FileInputStream("../common/config.properties");
                    properties.load(streamFileInput);
    
                    /* POTENTIAL FLAW: Read data from a .properties file */
                    String stringNumber = properties.getProperty("data");
                    if (stringNumber != null) // avoid NPD incidental warnings
                    {
                        try
                        {
                            data = Integer.parseInt(stringNumber.trim());
                        }
                        catch(NumberFormatException exceptNumberFormat)
                        {
                            IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                        }
                    }
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
    
            for (int i = 0; i < 1; i++)
            {
                /* POTENTIAL FLAW: Create a HashSet using data as the initial size.  data may be very large, creating memory issues */
                HashSet intHashSet = new HashSet(data);
            }
        }
};