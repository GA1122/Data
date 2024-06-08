class bad_class{
    public void bad() throws Throwable
        {
            String dataCopy;
            {
                String data;
    
                /* INCIDENTAL: CWE-798 Use of Hard-coded Credentials */
                PasswordAuthentication credentials = new PasswordAuthentication("user", "AP@ssw0rd".toCharArray());
    
                /* POTENTIAL FLAW: Set data to be a password, which can be transmitted over a non-secure
                 * channel in the sink */
                data = new String(credentials.getPassword());
    
                dataCopy = data;
            }
            {
                String data = dataCopy;
    
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