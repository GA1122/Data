class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            String data;
            if (IO.STATIC_FINAL_FALSE)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
            else
            {
    
                /* FIX: Use a regular string (non-sensitive string) */
                data = "Hello World";
    
            }
    
            if (IO.STATIC_FINAL_TRUE)
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