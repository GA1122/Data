class bad_class{
    public void bad() throws Throwable
        {
            String password = (new CWE319_Cleartext_Tx_Sensitive_Info__URLConnection_kerberosKey_61b()).badSource();
    
            if (password != null)
            {
                KerberosPrincipal principal = new KerberosPrincipal("test");
                /* POTENTIAL FLAW: Use password directly in KerberosKey() */
                KerberosKey key = new KerberosKey(principal, password.toCharArray(), null);
                IO.writeLine(key.toString());
            }
    
        }
};