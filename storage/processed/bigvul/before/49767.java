class badSink_class{
    public void badSink(byte[] dataSerialized ) throws Throwable
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
                    String stringToEncrypt = "Super secret Squirrel";
                    byte[] byteStringToEncrypt = stringToEncrypt.getBytes("UTF-8");
                    /* POTENTIAL FLAW: Use data as a cryptographic key */
                    SecretKeySpec secretKeySpec = new SecretKeySpec(data.getBytes("UTF-8"), "AES");
                    Cipher aesCipher = Cipher.getInstance("AES");
                    aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
                    byte[] byteCipherText = aesCipher.doFinal(byteStringToEncrypt);
                    IO.writeLine(IO.toHex(byteCipherText)); /* Write encrypted data to console */
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