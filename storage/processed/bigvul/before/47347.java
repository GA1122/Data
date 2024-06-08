class goodB2G1_class{
    private void goodB2G1() throws Throwable
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
    
            goodB2G1Private = false;
            goodB2G1Sink(password );
        }
};