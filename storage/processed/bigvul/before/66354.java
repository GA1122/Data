class bad_class{
    public void bad() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_FIVE == 5)
            {
                ServerSocket listener = null;
                Socket socket = null;
                OutputStream streamOutput = null;
                int port = 20000;
                try
                {
                    listener = new ServerSocket(port);
                    socket = listener.accept(); /* INCIDENTAL: Use of Socket */
                    /* FLAW: IP-based logic */
                    if (socket.getInetAddress().getHostAddress().equals("192.168.30.123"))
                    {
                        streamOutput = socket.getOutputStream();
                        streamOutput.write("Welcome, admin!".getBytes("UTF-8"));
                    }
                    else
                    {
                        streamOutput = socket.getOutputStream();
                        streamOutput.write("Welcome, user.".getBytes("UTF-8"));
                    }
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