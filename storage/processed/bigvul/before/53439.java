class bad_class{
    public void bad() throws Throwable
        {
            float data;
    
            data = 0.0f; /* POTENTIAL FLAW: data is set to zero */
    
            /* serialize data to a byte array */
            ByteArrayOutputStream streamByteArrayOutput = null;
            ObjectOutput outputObject = null;
    
            try
            {
                streamByteArrayOutput = new ByteArrayOutputStream() ;
                outputObject = new ObjectOutputStream(streamByteArrayOutput) ;
                outputObject.writeObject(data);
                byte[] dataSerialized = streamByteArrayOutput.toByteArray();
                (new CWE369_Divide_by_Zero__float_zero_divide_75b()).badSink(dataSerialized  );
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