class bad_class{
    public void bad() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_FIVE == 5)
            {
                FileOutputStream streamFileOutput = null;
                try
                {
                    String path = "C:\\test_bad.txt";
                    File file = new File(path);
                    long lastModified = file.lastModified();
                    streamFileOutput = new FileOutputStream(file);
                    streamFileOutput.write("This is a new line".getBytes("UTF-8"));
                    /* INCIDENTAL: CWE 252 - Unchecked Return Value - some tools report
                     * an unchecked return value from setLastModified, but this is intentional as
                     * this method call is supposed to be "hidden" in the code
                     */
                    /* FLAW: altering file properties */
                    file.setLastModified(lastModified - 10000L);
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