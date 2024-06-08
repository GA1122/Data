class bad_class{
    public void bad() throws Throwable
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
                /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
                byte result = (byte)(++data);
                IO.writeLine("result: " + result);
                break;
            }
        }
};