class bad_class{
    public void bad() throws Throwable
        {
            String data;
            if(IO.staticReturnsTrueOrFalse())
            {
                data = ""; /* Initialize data */
                /* read input from URLConnection */
                {
                    URLConnection urlConnection = (new URL("http://www.example.org/")).openConnection();
                    BufferedReader readerBuffered = null;
                    InputStreamReader readerInputStream = null;
                    try
                    {
                        readerInputStream = new InputStreamReader(urlConnection.getInputStream(), "UTF-8");
                        readerBuffered = new BufferedReader(readerInputStream);
                        /* POTENTIAL FLAW: Read data from a web server with URLConnection */
                        /* This will be reading the first "line" of the response body,
                         * which could be very long if there are no newlines in the HTML */
                        data = readerBuffered.readLine();
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
    
                /* FIX: Use a hardcoded string */
                data = "foo";
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                if (data != null)
                {
                    /* POTENTIAL FLAW: uncontrolled string formatting */
                    System.out.printf(data);
                }
            }
            else
            {
    
                if (data != null)
                {
                    /* FIX: explicitly defined string formatting */
                    System.out.printf("%s%n", data);
                }
    
            }
        }
};