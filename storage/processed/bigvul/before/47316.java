class bad_class{
    public void bad() throws Throwable
        {
            String password;
            if (IO.staticReturnsTrue())
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
                /* POTENTIAL FLAW: The raw password read from the .properties file is passed on (without being decrypted) */
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure password is inititialized before the Sink to avoid compiler errors */
                password = null;
            }
    
            if(IO.staticReturnsTrue())
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