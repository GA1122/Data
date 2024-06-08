class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            String password = null;
    
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
    
            goodB2G2PublicStatic = true;
            (new CWE256_Plaintext_Storage_of_Password__basic_22b()).goodB2G2Sink(password );
        }
};