class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Use a regular string (non-sensitive string) */
                data = "Hello World";
            }
            else
            {
    
                /* FIX: Use a regular string (non-sensitive string) */
                data = "Hello World";
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                Socket socket = null;
                PrintWriter writer = null;
                try
                {
                    socket = new Socket("remote_host", 1337);
                    writer = new PrintWriter(socket.getOutputStream(), true);
                    /* POTENTIAL FLAW: sending data over an unencrypted (non-SSL) channel */
                    writer.println(data);
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error writing to the socket", exceptIO);
                }
                finally
                {
                    if (writer != null)
                    {
                        writer.close();
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
                        IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                    }
                }
            }
            else
            {
    
                Socket socket = null;
                PrintWriter writer = null;
    
                try
                {
                    socket = new Socket("remote_host", 1337);
                    writer = new PrintWriter(socket.getOutputStream(), true);
                    /* POTENTIAL FLAW: sending data over an unencrypted (non-SSL) channel */
                    writer.println(data);
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error writing to the socket", exceptIO);
                }
                finally
                {
                    if (writer != null)
                    {
                        writer.close();
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
                        IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                    }
                }
    
            }
        }
};