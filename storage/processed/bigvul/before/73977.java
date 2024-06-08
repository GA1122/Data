class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* FLAW: Set data to Integer.MAX_VALUE */
            data = Integer.MAX_VALUE;
    
            /* serialize data to a byte array */
            ByteArrayOutputStream streamByteArrayOutput = null;
            ObjectOutput outputObject = null;
    
            try
            {
                streamByteArrayOutput = new ByteArrayOutputStream() ;
                outputObject = new ObjectOutputStream(streamByteArrayOutput) ;
                outputObject.writeObject(data);
                byte[] dataSerialized = streamByteArrayOutput.toByteArray();
                (new CWE789_Uncontrolled_Mem_Alloc__max_value_HashSet_75b()).badSink(dataSerialized  );
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