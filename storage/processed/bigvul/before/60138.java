class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int count;
            if (IO.staticFive==5)
            {
                count = Integer.MIN_VALUE; /* Initialize count */
                {
                    File file = new File("C:\\data.txt");
                    FileInputStream streamFileInput = null;
                    InputStreamReader readerInputStream = null;
                    BufferedReader readerBuffered = null;
                    try
                    {
                        /* read string from file into count */
                        streamFileInput = new FileInputStream(file);
                        readerInputStream = new InputStreamReader(streamFileInput, "UTF-8");
                        readerBuffered = new BufferedReader(readerInputStream);
                        /* POTENTIAL FLAW: Read count from a file */
                        /* This will be reading the first "line" of the file, which
                         * could be very long if there are little or no newlines in the file */
                        String stringNumber = readerBuffered.readLine();
                        if (stringNumber != null) /* avoid NPD incidental warnings */
                        {
                            try
                            {
                                count = Integer.parseInt(stringNumber.trim());
                            }
                            catch(NumberFormatException exceptNumberFormat)
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
                 * but ensure count is inititialized before the Sink to avoid compiler errors */
                count = 0;
            }
    
            if (IO.staticFive!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: Validate count before using it as the for loop variant to write to a file */
                if (count > 0 && count <= 20)
                {
                    File file = new File("goodSink.txt");
                    FileOutputStream streamFileOutput = new FileOutputStream(file);
                    OutputStreamWriter writerOutputStream = new OutputStreamWriter(streamFileOutput, "UTF-8");
                    BufferedWriter writerBuffered = new BufferedWriter(writerOutputStream);
                    int i;
                    for (i = 0; i < count; i++)
                    {
                        try
                        {
                            writerBuffered.write("Hello");
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error with stream writing", exceptIO);
                        }
                    }
                    /* Close stream reading objects */
                    try
                    {
                        if (writerBuffered != null)
                        {
                            writerBuffered.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing BufferedWriter", exceptIO);
                    }
                    try
                    {
                        if (writerOutputStream != null)
                        {
                            writerOutputStream.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing OutputStreamWriter", exceptIO);
                    }
                    try
                    {
                        if (streamFileOutput != null)
                        {
                            streamFileOutput.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing FileOutputStream", exceptIO);
                    }
                }
    
            }
        }
};