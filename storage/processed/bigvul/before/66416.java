class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
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
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};