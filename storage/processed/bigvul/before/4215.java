class bad_class{
    public void bad() throws Throwable
        {
            int data;
            if (privateReturnsTrue())
            {
                data = Integer.MIN_VALUE; /* Initialize data */
                {
                    File file = new File("C:\\data.txt");
                    FileInputStream streamFileInput = null;
                    InputStreamReader readerInputStream = null;
                    BufferedReader readerBuffered = null;
                    try
                    {
                        /* read string from file into data */
                        streamFileInput = new FileInputStream(file);
                        readerInputStream = new InputStreamReader(streamFileInput, "UTF-8");
                        readerBuffered = new BufferedReader(readerInputStream);
                        /* POTENTIAL FLAW: Read data from a file */
                        /* This will be reading the first "line" of the file, which
                         * could be very long if there are little or no newlines in the file */
                        String stringNumber = readerBuffered.readLine();
                        if (stringNumber != null) /* avoid NPD incidental warnings */
                        {
                            try
                            {
                                data = Integer.parseInt(stringNumber.trim());
                            }
                            catch(NumberFormatException exceptNumberFormat)
                            {
                                IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                            }
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                    }
                    finally
                    {
                        /* Close stream reading objects */
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
    
                        try
                        {
                            if (streamFileInput != null)
                            {
                                streamFileInput.close();
                            }
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                        }
                    }
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (privateReturnsTrue())
            {
                int array[] = null;
                /* POTENTIAL FLAW: Verify that data is non-negative, but still allow it to be 0 */
                if (data >= 0)
                {
                    array = new int[data];
                }
                else
                {
                    IO.writeLine("Array size is negative");
                }
                /* do something with the array */
                array[0] = 5;
                IO.writeLine(array[0]);
            }
        }
};