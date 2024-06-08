class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            String password;
            if (PRIVATE_STATIC_FINAL_FIVE!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure password is inititialized before the Sink to avoid compiler errors */
                password = null;
            }
            else
            {
    
                /* FIX: Use a hardcoded password as the password (it was not sent over the network) */
                /* INCIDENTAL FLAW: CWE-259 Hard Coded Password */
                password = "Password1234!";
    
            }
    
            if (PRIVATE_STATIC_FINAL_FIVE==5)
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