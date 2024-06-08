class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String password;
    
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
    
            /* POTENTIAL FLAW: The raw password read from the .properties file is passed on (without being decrypted) */
    
            HashMap<Integer,String> passwordHashMap = new HashMap<Integer,String>();
            passwordHashMap.put(0, password);
            passwordHashMap.put(1, password);
            passwordHashMap.put(2, password);
            (new CWE256_Plaintext_Storage_of_Password__basic_74b()).goodB2GSink(passwordHashMap  );
        }
};