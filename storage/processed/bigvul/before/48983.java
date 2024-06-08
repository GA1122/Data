class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            String data;
    
            switch (6)
            {
            case 6:
                /* INCIDENTAL: CWE-798 Use of Hard-coded Credentials */
                PasswordAuthentication credentials = new PasswordAuthentication("user", "AP@ssw0rd".toCharArray());
                /* POTENTIAL FLAW: Set data to be a password, which can be transmitted over a non-secure
                 * channel in the sink */
                data = new String(credentials.getPassword());
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
                break;
            }
    
            switch (7)
            {
            case 7:
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
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};