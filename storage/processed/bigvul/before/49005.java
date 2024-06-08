class goodB2G1Sink_class{
    public void goodB2G1Sink(String data ) throws Throwable
        {
            if (CWE319_Cleartext_Tx_Sensitive_Info__send_22a.goodB2G1PublicStatic)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
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