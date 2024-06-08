class goodB2GSink_class{
    public void goodB2GSink(byte[] countSerialized ) throws Throwable
        {
            /* unserialize count */
            ByteArrayInputStream streamByteArrayInput = null;
            ObjectInputStream streamObjectInput = null;
    
            try
            {
                streamByteArrayInput = new ByteArrayInputStream(countSerialized);
                streamObjectInput = new ObjectInputStream(streamByteArrayInput);
                int count = (Integer)streamObjectInput.readObject();
    
                /* FIX: Validate count before using it in a call to Thread.sleep() */
                if (count > 0 && count <= 2000)
                {
                    Thread.sleep(count);
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