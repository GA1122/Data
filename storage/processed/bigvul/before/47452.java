class goodB2GSink_class{
    public void goodB2GSink(byte[] passwordSerialized ) throws Throwable
        {
            /* unserialize password */
            ByteArrayInputStream streamByteArrayInput = null;
            ObjectInputStream streamObjectInput = null;
    
            try
            {
                streamByteArrayInput = new ByteArrayInputStream(passwordSerialized);
                streamObjectInput = new ObjectInputStream(streamByteArrayInput);
                String password = (String)streamObjectInput.readObject();
    
                /* FIX: password is decrypted before being used as a database password */
                {
                    Cipher aesCipher = Cipher.getInstance("AES");
    
                    /* INCIDENTAL: Hardcoded crypto */
                    SecretKeySpec secretKeySpec = new SecretKeySpec("ABCDEFGHABCDEFGH".getBytes("UTF-8"), "AES");
                    aesCipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
    
                    String decryptedPassword = new String(aesCipher.doFinal(password.getBytes("UTF-8")), "UTF-8");
                    password = decryptedPassword;
                }
    
                Connection dBConnection = null;
                try
                {
                    dBConnection = DriverManager.getConnection("192.168.105.23", "sa", password);
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
                }
                finally
                {
                    try
                    {
                        if (dBConnection != null)
                        {
                            dBConnection.close();
                        }
                    }
                    catch (SQLException exceptSql)
                    {
                        IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
                    }
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