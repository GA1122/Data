class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String password;
    
            /* FIX: Use a hardcoded password as the password (it was not sent over the network) */
            /* INCIDENTAL FLAW: CWE-259 Hard Coded Password */
            password = "Password1234!";
    
            /* serialize password to a byte array */
            ByteArrayOutputStream streamByteArrayOutput = null;
            ObjectOutput outputObject = null;
    
            try
            {
                streamByteArrayOutput = new ByteArrayOutputStream() ;
                outputObject = new ObjectOutputStream(streamByteArrayOutput) ;
                outputObject.writeObject(password);
                byte[] passwordSerialized = streamByteArrayOutput.toByteArray();
                (new CWE319_Cleartext_Tx_Sensitive_Info__URLConnection_passwordAuth_75b()).goodG2BSink(passwordSerialized  );
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