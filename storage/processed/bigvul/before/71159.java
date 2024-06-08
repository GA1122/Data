class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                BufferedReader readerBuffered = null;
                InputStreamReader readerInputStream = null;
                try
                {
                    /* Enter: 1e-50, result should be 0.0 (for bad case)
                     *
                     * Note: alternate input
                     * 999999999999999999999999999999999999999999999999999999999999999
                     */
                    readerInputStream = new InputStreamReader(System.in, "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    double doubleNumber = 0;
                    IO.writeString("Enter double number (1e-50): ");
                    try
                    {
                        doubleNumber = Double.parseDouble(readerBuffered.readLine());
                    }
                    catch (NumberFormatException exceptionNumberFormat)
                    {
                        IO.writeLine("Error parsing number");
                    }
                    /* FLAW: should not cast without checking if conversion is safe */
                    IO.writeLine("" + (float)doubleNumber);
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
            else
            {
    
                BufferedReader readerBuffered = null;
                InputStreamReader readerInputStream = null;
    
                try
                {
                    readerInputStream = new InputStreamReader(System.in, "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    double num = 0;
    
                    IO.writeString("Enter double number (1e-50): ");
    
                    try
                    {
                        num = Double.parseDouble(readerBuffered.readLine());
                    }
                    catch (NumberFormatException exceptionNumberFormat)
                    {
                        IO.writeLine("Error parsing number");
                    }
    
                    /* FIX: check for conversion error */
                    if (num > Float.MAX_VALUE || num < Float.MIN_VALUE)
                    {
                        IO.writeLine("Error, cannot safely cast this number to a float!");
                        return;
                    }
    
                    IO.writeLine("" + (float)num);
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