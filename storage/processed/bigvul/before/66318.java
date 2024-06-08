class good2_class{
    private void good2() throws Throwable
        {
            if (IO.STATIC_FINAL_TRUE)
            {
                ServerSocket listener = null;
                Socket socket = null;
                OutputStream streamOutput = null;
                int port = 20000;
                try
                {
                    listener = new ServerSocket(port);
                    socket = listener.accept();
                    streamOutput = socket.getOutputStream();
                    /* FIX: No host-based logic */
                    streamOutput.write(("Welcome, " + socket.getInetAddress().getHostName()).getBytes("UTF-8"));
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Could not connect to port " + Integer.toString(port), exceptIO);
                }
                finally
                {
                    try
                    {
                        if (streamOutput != null)
                        {
                            streamOutput.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing objects", exceptIO);
                    }
    
                    try
                    {
                        if (socket != null)
                        {
                            socket.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing objects", exceptIO);
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
                        IO.logger.log(Level.WARNING, "Error closing objects", exceptIO);
                    }
    
                }
            }
        }
};