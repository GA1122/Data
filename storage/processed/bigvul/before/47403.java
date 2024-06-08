class bad_class{
    public void bad() throws Throwable
        {
            String password = (new CWE256_Plaintext_Storage_of_Password__basic_61b()).badSource();
    
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