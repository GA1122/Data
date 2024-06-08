class good2_class{
    private void good2() throws Throwable
        {
            if (privateTrue)
            {
                BufferedReader readerBuffered = null;
                InputStreamReader readerInputStream = null;
                try
                {
                    readerInputStream = new InputStreamReader(System.in, "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    float num = 0;
                    IO.writeString("Enter float number (1e20f): ");
                    try
                    {
                        num = Float.parseFloat(readerBuffered.readLine());
                    }
                    catch (NumberFormatException exceptionNumberFormat)
                    {
                        IO.writeLine("Error parsing number");
                    }
                    /* FIX: check to make sure conversion is safe */
                    if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE)
                    {
                        IO.writeLine("Value is too small or large to be represented as an int");
                    }
                    else
                    {
                        IO.writeLine("" + (int)num);
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