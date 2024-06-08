class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data = null;
    
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
    
            goodB2G1PublicStatic = false;
            (new CWE643_Xpath_Injection__console_readLine_22b()).goodB2G1Sink(data );
        }
};