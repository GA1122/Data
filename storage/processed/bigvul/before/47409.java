class badSink_class{
    public void badSink(String passwordArray[] ) throws Throwable
        {
            String password = passwordArray[2];
    
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
};