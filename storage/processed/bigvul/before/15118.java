class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            byte data;
    
            while (true)
            {
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
                        data = Byte.parseByte(stringNumber.trim());
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
                break;
            }
    
            while (true)
            {
                /* FIX: Add a check to prevent an overflow from occurring */
                /* NOTE: Math.abs of the minimum int or long will return that same value, so we must check for it */
                if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long)Math.sqrt(Byte.MAX_VALUE)))
                {
                    byte result = (byte)(data * data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too large to perform squaring.");
                }
                break;
            }
        }
};