class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            short data;
    
            /* init data */
            data = -1;
    
            /* POTENTIAL FLAW: Read data from console with readLine*/
            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;
    
            try
            {
                readerInputStream = new InputStreamReader(System.in, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);
    
                String stringNumber = readerBuffered.readLine();
                if (stringNumber != null)
                {
                    data = Short.parseShort(stringNumber.trim());
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
            }
            catch (NumberFormatException exceptNumberFormat)
            {
                IO.logger.log(Level.WARNING, "Error with number parsing", exceptNumberFormat);
            }
            finally
            {
                /* clean up stream reading objects */
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
                finally
                {
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
    
            for (int k = 0; k < 1; k++)
            {
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* FIX: Add a check to prevent an underflow from occurring */
                    if (data > (Short.MIN_VALUE/2))
                    {
                        short result = (short)(data * 2);
                        IO.writeLine("result: " + result);
                    }
                    else
                    {
                        IO.writeLine("data value is too small to perform multiplication.");
                    }
                }
            }
        }
};