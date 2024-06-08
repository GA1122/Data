class goodG2BSink_class{
    public void goodG2BSink(String password ) throws Throwable
        {
            if (CWE319_Cleartext_Tx_Sensitive_Info__URLConnection_kerberosKey_22a.goodG2BPublicStatic)
            {
                if (password != null)
                {
                    KerberosPrincipal principal = new KerberosPrincipal("test");
                    /* POTENTIAL FLAW: Use password directly in KerberosKey() */
                    KerberosKey key = new KerberosKey(principal, password.toCharArray(), null);
                    IO.writeLine(key.toString());
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure password is inititialized before the Sink to avoid compiler errors */
                password = null;
            }
        }
};