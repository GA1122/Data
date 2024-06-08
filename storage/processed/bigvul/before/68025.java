class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * data is uninitialized
             */
    
            data = ""; /* Initialize data */
    
            {
                InputStreamReader readerInputStream = null;
                BufferedReader readerBuffered = null;
    
                /* read user input from console with readLine */
                try
                {
                    readerInputStream = new InputStreamReader(System.in, "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
    
                    /* POTENTIAL FLAW: Read data from the console using readLine */
                    data = readerBuffered.readLine();
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
            /* NOTE: Tools may report a flaw here because buffread and isr are not closed.  Unfortunately, closing those will close System.in, which will cause any future attempts to read from the console to fail and throw an exception */
    
            for (int j = 0; j < 1; j++)
            {
                int numberOfLoops;
                try
                {
                    numberOfLoops = Integer.parseInt(data);
                }
                catch (NumberFormatException exceptNumberFormat)
                {
                    IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                    numberOfLoops = 1;
                }
                for (int i=0; i < numberOfLoops; i++)
                {
                    /* POTENTIAL FLAW: user supplied input used for loop counter test */
                    IO.writeLine("hello world");
                }
            }
        }
};