class bad_class{
    public void bad() throws Throwable
        {
            String data;
            if (PRIVATE_STATIC_FINAL_FIVE == 5)
            {
                data = ""; /* Initialize data */
                /* Read data using a listening tcp connection */
                {
                    ServerSocket listener = null;
                    Socket socket = null;
                    BufferedReader readerBuffered = null;
                    InputStreamReader readerInputStream = null;
                    /* Read data using a listening tcp connection */
                    try
                    {
                        listener = new ServerSocket(39543);
                        socket = listener.accept();
                        /* read input from socket */
                        readerInputStream = new InputStreamReader(socket.getInputStream(), "UTF-8");
                        readerBuffered = new BufferedReader(readerInputStream);
                        /* POTENTIAL FLAW: Read data using a listening tcp connection */
                        data = readerBuffered.readLine();
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
    
                        /* Close socket objects */
                        try
                        {
                            if (socket != null)
                            {
                                socket.close();
                            }
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                        }
    
                        try
                        {
                            if (listener != null)
                            {
                                listener.close();
                            }
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error closing ServerSocket", exceptIO);
                        }
                    }
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
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
};