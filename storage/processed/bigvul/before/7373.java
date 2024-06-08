class bad_class{
    public void bad() throws Throwable
        {
            int data;
            if(IO.staticReturnsTrueOrFalse())
            {
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
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
                int array[] = { 0, 1, 2, 3, 4 };
                /* POTENTIAL FLAW: Attempt to write to array at location data, which may be outside the array bounds */
                array[data] = 42;
                /* Skip reading back data from array since that may be another out of bounds operation */
            }
            else
            {
    
                /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
                int array[] = { 0, 1, 2, 3, 4 };
    
                /* FIX: Verify index before writing to array at location data */
                if (data >= 0 && data < array.length)
                {
                    array[data] = 42;
                }
                else
                {
                    IO.writeLine("Array index out of bounds");
                }
    
            }
        }
};