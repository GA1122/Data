class bad_class{
    public void bad() throws Throwable
        {
            String password;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * password is uninitialized
             */
    
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
    
            for (int j = 0; j < 1; j++)
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