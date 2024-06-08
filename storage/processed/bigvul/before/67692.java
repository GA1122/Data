class bad_class{
    public void bad() throws Throwable
        {
            if (privateFive == 5)
            {
                BufferedReader readerBuffered = null;
                InputStreamReader readerInputStream = null;
                try
                {
                    readerInputStream = new InputStreamReader(System.in, "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    /* read user input from console */
                    IO.writeLine("Enter string1: "); /* enter "test" */
                    String string1 = readerBuffered.readLine();
                    IO.writeLine("Enter string2: "); /* enter "test" */
                    String string2 = readerBuffered.readLine();
                    if (string1 != null && string2 != null)
                    {
                        /* output comparison results */
                        if (string1 == string2)     /* FLAW: using == operator instead of .equals() object method */
                        {
                            IO.writeLine("bad(): Strings are equal");
                        }
                        else
                        {
                            IO.writeLine("bad(): Strings are not equal"); /* This will always display */
                        }
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error!", exceptIO);
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