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
                float data = (Float)streamObjectInput.readObject();
    
                /* FIX: Check for value of or near zero before modulo */
                if (Math.abs(data) > 0.000001)
                {
                    int result = (int)(100.0 % data);
                    IO.writeLine(result);
                }
                else
                {
                    IO.writeLine("This would result in a modulo by zero");
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