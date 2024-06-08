class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
            {
                BufferedReader readerBuffered = null;
                InputStreamReader readerInputStream = null;
                try
                {
                    readerInputStream = new InputStreamReader(System.in, "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    IO.writeString("Enter float number: ");
                    float num = 0;
                    try
                    {
                        num = Float.parseFloat(readerBuffered.readLine());
                    }
                    catch (NumberFormatException exceptionNumberFormat)
                    {
                        IO.writeLine("Error parsing number");
                    }
                    /* FIX: check for sign */
                    if (num < 0)
                    {
                        IO.writeLine("Negative Number");
                    }
                    else
                    {
                        IO.writeLine("" + (int)(Math.sqrt(num)));
                    }
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
        }
};