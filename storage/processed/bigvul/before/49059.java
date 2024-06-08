class goodG2BSink_class{
    public void goodG2BSink(CWE319_Cleartext_Tx_Sensitive_Info__send_67a.Container dataContainer ) throws Throwable
        {
            String data = dataContainer.containerOne;
    
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
};