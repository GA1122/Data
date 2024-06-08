class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String password;
            if(IO.staticReturnsTrueOrFalse())
            {
                password = ""; /* init password */
                /* retrieve the property */
                Properties properties = new Properties();
                FileInputStream streamFileInput = null;
                try
                {
                    streamFileInput = new FileInputStream("../common/config.properties");
                    properties.load(streamFileInput);
                    password = properties.getProperty("password");
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                finally
                {
                    /* clean up stream reading objects */
                    try
                    {
                        if (streamFileInput != null)
                        {
                            streamFileInput.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                    }
                }
                /* FIX: password is decrypted before being passed on */
                {
                    Cipher aesCipher = Cipher.getInstance("AES");
    
                    /* INCIDENTAL: CWE-321: Use of Hard-coded Cryptographic Key */
                    SecretKeySpec secretKeySpec = new SecretKeySpec("ABCDEFGHABCDEFGH".getBytes("UTF-8"), "AES");
                    aesCipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
    
                    String decryptedPassword = new String(aesCipher.doFinal(password.getBytes("UTF-8")), "UTF-8");
                    password = decryptedPassword;
                }
            }
            else
            {
    
                password = ""; /* init password */
    
                /* retrieve the property */
                Properties properties = new Properties();
    
                FileInputStream streamFileInput = null;
                try
                {
                    streamFileInput = new FileInputStream("../common/config.properties");
                    properties.load(streamFileInput);
    
                    password = properties.getProperty("password");
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                finally
                {
                    /* clean up stream reading objects */
                    try
                    {
                        if (streamFileInput != null)
                        {
                            streamFileInput.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                    }
                }
    
                /* FIX: password is decrypted before being passed on */
                {
                    Cipher aesCipher = Cipher.getInstance("AES");
    
                    /* INCIDENTAL: CWE-321: Use of Hard-coded Cryptographic Key */
                    SecretKeySpec secretKeySpec = new SecretKeySpec("ABCDEFGHABCDEFGH".getBytes("UTF-8"), "AES");
                    aesCipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
    
                    String decryptedPassword = new String(aesCipher.doFinal(password.getBytes("UTF-8")), "UTF-8");
                    password = decryptedPassword;
                }
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Use password as a password to connect to a DB  (without being decrypted) */
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
            else
            {
    
                /* POTENTIAL FLAW: Use password as a password to connect to a DB  (without being decrypted) */
    
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
        }
};