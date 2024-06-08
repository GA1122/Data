class good1_class{
    private void good1() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_FIVE != 5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
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
                        /* output comparison */
                        if (string1.equals(string2))  /* FIX: use of equals() instead of == operator */
                        {
                            IO.writeLine("good(): Strings are equal");
                        }
                        else
                        {
                            IO.writeLine("good(): Strings are not equal");
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
                        if (readerBuffered != null )
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
                        if (readerInputStream != null )
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