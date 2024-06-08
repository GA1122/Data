class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int count;
            if (true)
            {
                count = Integer.MIN_VALUE; /* Initialize count */
                /* get system property user.home */
                /* POTENTIAL FLAW: Read count from a system property */
                {
                    String stringNumber = System.getProperty("user.home");
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
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure count is inititialized before the Sink to avoid compiler errors */
                count = 0;
            }
    
            if (false)
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