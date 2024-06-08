class bad_class{
    public void bad() throws Throwable
        {
            String data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* INCIDENTAL: CWE-798 Use of Hard-coded Credentials */
                PasswordAuthentication credentials = new PasswordAuthentication("user", "AP@ssw0rd".toCharArray());
                /* POTENTIAL FLAW: Set data to be a password, which can be transmitted over a non-secure
                 * channel in the sink */
                data = new String(credentials.getPassword());
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
    
                SSLSocketFactory sslsSocketFactory = null;
                SSLSocket sslSocket = null;
                PrintWriter writer = null;
    
                try
                {
                    sslsSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
                    sslSocket = (SSLSocket) sslsSocketFactory.createSocket("remote_host", 1337);
                    writer = new PrintWriter(sslSocket.getOutputStream(), true);
                    /* FIX: sending data over an SSL encrypted channel */
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
                        if (sslSocket != null)
                        {
                            sslSocket.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing SSLSocket", exceptIO);
                    }
                }
    
            }
        }
};