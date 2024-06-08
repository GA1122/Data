class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            for (int i = 0; i < 1; i++)
            {
                String root;
                if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
                {
                    /* running on Windows */
                    root = "C:\\uploads\\";
                }
                else
                {
                    /* running on non-Windows */
                    root = "/home/user/uploads/";
                }
                if (data != null)
                {
                    /* POTENTIAL FLAW: no validation of concatenated value */
                    File file = new File(root + data);
                    FileInputStream streamFileInputSink = null;
                    InputStreamReader readerInputStreamSink = null;
                    BufferedReader readerBufferdSink = null;
                    if (file.exists() && file.isFile())
                    {
                        try
                        {
                            streamFileInputSink = new FileInputStream(file);
                            readerInputStreamSink = new InputStreamReader(streamFileInputSink, "UTF-8");
                            readerBufferdSink = new BufferedReader(readerInputStreamSink);
                            IO.writeLine(readerBufferdSink.readLine());
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
                                if (readerBufferdSink != null)
                                {
                                    readerBufferdSink.close();
                                }
                            }
                            catch (IOException exceptIO)
                            {
                                IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                            }
    
                            try
                            {
                                if (readerInputStreamSink != null)
                                {
                                    readerInputStreamSink.close();
                                }
                            }
                            catch (IOException exceptIO)
                            {
                                IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                            }
    
                            try
                            {
                                if (streamFileInputSink != null)
                                {
                                    streamFileInputSink.close();
                                }
                            }
                            catch (IOException exceptIO)
                            {
                                IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                            }
                        }
                    }
                }
            }
        }
};