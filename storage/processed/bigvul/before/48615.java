class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String password;
    
            /* FIX: Use a hardcoded password as the password (it was not sent over the network) */
            /* INCIDENTAL FLAW: CWE-259 Hard Coded Password */
            password = "Password1234!";
    
            for (int j = 0; j < 1; j++)
            {
                if (password != null)
                {
                    KerberosPrincipal principal = new KerberosPrincipal("test");
                    /* POTENTIAL FLAW: Use password directly in KerberosKey() */
                    KerberosKey key = new KerberosKey(principal, password.toCharArray(), null);
                    IO.writeLine(key.toString());
                }
            }
        }
};