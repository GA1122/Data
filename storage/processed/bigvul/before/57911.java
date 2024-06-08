class bad_class{
    public void bad() throws Throwable
        {
            if (IO.STATIC_FINAL_FIVE == 5)
            {
                File file = null;
                FileInputStream streamFileInput = null;
                InputStreamReader readerInputStream = null;
                BufferedReader readerBuffered = null;
                if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
                {
                    /* running on Windows */
                    file = new File("C:\\doesntexistandneverwill.txt");
                }
                else
                {
                    /* running on non-Windows */
                    file = new File("/home/user/doesntexistandneverwill.txt");
                }
                try
                {
                    streamFileInput = new FileInputStream(file);
                    readerInputStream = new InputStreamReader(streamFileInput, "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                }
                catch (FileNotFoundException exceptFileNotFound)
                {
                    /* FLAW: do nothing if the file doesn't exist */
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
};