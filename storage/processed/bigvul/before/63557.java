class bad_class{
    public void bad() throws Throwable
        {
            int count;
            if (IO.staticTrue)
            {
                count = Integer.MIN_VALUE; /* Initialize count */
                /* read input from URLConnection */
                {
                    URLConnection urlConnection = (new URL("http://www.example.org/")).openConnection();
                    BufferedReader readerBuffered = null;
                    InputStreamReader readerInputStream = null;
                    try
                    {
                        readerInputStream = new InputStreamReader(urlConnection.getInputStream(), "UTF-8");
                        readerBuffered = new BufferedReader(readerInputStream);
                        /* POTENTIAL FLAW: Read count from a web server with URLConnection */
                        /* This will be reading the first "line" of the response body,
                         * which could be very long if there are no newlines in the HTML */
                        String stringNumber = readerBuffered.readLine();
                        if (stringNumber != null) // avoid NPD incidental warnings
                        {
                            try
                            {
                                count = Integer.parseInt(stringNumber.trim());
                            }
                            catch (NumberFormatException exceptNumberFormat)
                            {
                                IO.logger.log(Level.WARNING, "Number format exception parsing count from string", exceptNumberFormat);
                            }
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
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
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure count is inititialized before the Sink to avoid compiler errors */
                count = 0;
            }
    
            if (IO.staticTrue)
            {
                /* POTENTIAL FLAW: Use count as the input to Thread.sleep() */
                Thread.sleep(count);
            }
        }
};