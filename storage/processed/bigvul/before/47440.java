class goodB2GSink_class{
    public void goodB2GSink(LinkedList<String> passwordLinkedList ) throws Throwable
        {
            String password = passwordLinkedList.remove(2);
    
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
};