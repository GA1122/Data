class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticTrue)
            {
                String contents = "";
                File file = new File("C:\\data.txt");
                FileInputStream streamFileInput = null;
                InputStreamReader readerInputStream = null;
                BufferedReader readerBuffered = null;
                try
                {
                    /* read string from file */
                    streamFileInput = new FileInputStream(file);
                    readerInputStream = new InputStreamReader(streamFileInput, "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    /* This will be reading the first "line" of the file, which
                     * could be very long if there are little or no newlines in the file */
                    contents = readerBuffered.readLine();
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
                Socket socket = null;
                OutputStreamWriter writerOutputStream = null;
                BufferedWriter writerBuffered = null;
                try
                {
                    /* Send data using an outbound tcp connection */
                    socket = new Socket("host.example.org", 39544);
                    writerOutputStream = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
                    writerBuffered = new BufferedWriter(writerOutputStream);
                    /* FLAW: Send file contents over the network */
                    if (contents != null)
                    {
                        writerBuffered.write(contents);
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream writing", exceptIO);
                }
                finally
                {
                    /* clean up stream writing objects */
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
    
                    /* clean up socket objects */
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
                }
            }
        }
};