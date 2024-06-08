class goodG2BSink_class{
    public void goodG2BSink(byte[] dataSerialized ) throws Throwable
        {
            /* unserialize data */
            ByteArrayInputStream streamByteArrayInput = null;
            ObjectInputStream streamObjectInput = null;
    
            try
            {
                streamByteArrayInput = new ByteArrayInputStream(dataSerialized);
                streamObjectInput = new ObjectInputStream(streamByteArrayInput);
                String data = (String)streamObjectInput.readObject();
    
                if (data != null)
                {
                    KerberosPrincipal principal = new KerberosPrincipal("test");
                    /* POTENTIAL FLAW: data used as password in KerberosKey() */
                    KerberosKey key = new KerberosKey(principal, data.toCharArray(), null);
                    IO.writeLine(key.toString());
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