class bad_class{
    public void bad() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
            count = Integer.MAX_VALUE;
    
            /* serialize count to a byte array */
            ByteArrayOutputStream streamByteArrayOutput = null;
            ObjectOutput outputObject = null;
    
            try
            {
                streamByteArrayOutput = new ByteArrayOutputStream() ;
                outputObject = new ObjectOutputStream(streamByteArrayOutput) ;
                outputObject.writeObject(count);
                byte[] countSerialized = streamByteArrayOutput.toByteArray();
                (new CWE400_Resource_Exhaustion__max_value_for_loop_75b()).badSink(countSerialized  );
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "IOException in serialization", exceptIO);
            }
            finally
            {
                /* clean up stream writing objects */
                try
                {
                    if (outputObject != null)
                    {
                        outputObject.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing ObjectOutputStream", exceptIO);
                }
    
                try
                {
                    if (streamByteArrayOutput != null)
                    {
                        streamByteArrayOutput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing ByteArrayOutputStream", exceptIO);
                }
            }
        }
};