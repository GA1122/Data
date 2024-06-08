class badSink_class{
    public void badSink(LinkedList<String> dataLinkedList ) throws Throwable
        {
            String data = dataLinkedList.remove(2);
    
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