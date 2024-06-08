class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                ServerSocket socket1 = null;
                ServerSocket socket2 = null;
                try
                {
                    socket1 = new ServerSocket();
                    socket1.bind(new InetSocketAddress(15000));
                    socket2 = new ServerSocket();
                    /* FIX: This will bind the second Socket to a different port */
                    socket2.bind(new InetSocketAddress("localhost", 15001));
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Unable to bind a socket", exceptIO);
                }
                finally
                {
                    try
                    {
                        if (socket2 != null)
                        {
                            socket2.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                    }
    
                    try
                    {
                        if (socket1 != null)
                        {
                            socket1.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                    }
                }
            }
            else
            {
    
                ServerSocket socket1 = null;
                ServerSocket socket2 = null;
    
                try
                {
                    socket1 = new ServerSocket();
                    socket1.bind(new InetSocketAddress(15000));
    
                    socket2 = new ServerSocket();
                    /* FIX: This will bind the second Socket to a different port */
                    socket2.bind(new InetSocketAddress("localhost", 15001));
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Unable to bind a socket", exceptIO);
                }
                finally
                {
                    try
                    {
                        if (socket2 != null)
                        {
                            socket2.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                    }
    
                    try
                    {
                        if (socket1 != null)
                        {
                            socket1.close();
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