class bad_class{
    public void bad() throws Throwable
        {
            String dataCopy;
            {
                String data;
    
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
    
                dataCopy = data;
            }
            {
                String data = dataCopy;
    
                /* POTENTIAL FLAW: unvalidated or sandboxed value */
                if (data != null)
                {
                    File file = new File(data);
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