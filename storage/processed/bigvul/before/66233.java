class good1_class{
    private void good1() throws Throwable
        {
            if (IO.STATIC_FINAL_FIVE != 5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                FileOutputStream streamFileOutput = null;
    
                try
                {
                    String path = "C:\\test_good.txt";
                    File file = new File(path);
                    streamFileOutput = new FileOutputStream(file);
                    streamFileOutput.write("This is a new line".getBytes("UTF-8"));
                    /* FIX: Not altering file properties */
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "File I/O error", exceptIO);
                }
                finally
                {
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