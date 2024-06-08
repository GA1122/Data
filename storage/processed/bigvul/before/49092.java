class goodB2GSink_class{
    public void goodB2GSink(byte[] dataSerialized ) throws Throwable
        {
            /* unserialize data */
            ByteArrayInputStream streamByteArrayInput = null;
            ObjectInputStream streamObjectInput = null;
    
            try
            {
                streamByteArrayInput = new ByteArrayInputStream(dataSerialized);
                streamObjectInput = new ObjectInputStream(streamByteArrayInput);
                String data = (String)streamObjectInput.readObject();
    
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
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "IOException in deserialization", exceptIO);
            }
            catch (ClassNotFoundException exceptClassNotFound)
            {
                IO.logger.log(Level.WARNING, "ClassNotFoundException in deserialization", exceptClassNotFound);
            }
            finally
            {
                /* clean up stream reading objects */
                try
                {
                    if (streamObjectInput != null)
                    {
                        streamObjectInput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing ObjectInputStream", exceptIO);
                }
    
                try
                {
                    if (streamByteArrayInput != null)
                    {
                        streamByteArrayInput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing ByteArrayInputStream", exceptIO);
                }
            }
        }
};