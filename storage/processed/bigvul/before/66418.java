class bad_class{
    public void bad() throws Throwable
        {
            for (int j = 0; j < 1; j++)
            {
                ServerSocket listener = null;
                Socket socket = null;
                int port = 30000;
                try
                {
                    listener = new ServerSocket(port); /* INCIDENTAL: Use of Socket */
                    /* wait for first connection */
                    /* FLAW: Listening for network connection */
                    socket = listener.accept();
                    /* connection successful, so do stuff */
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Could not listen on port " + Integer.toString(port), exceptIO);
                }
                finally
                {
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