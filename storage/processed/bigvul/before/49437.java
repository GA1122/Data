class badSink_class{
    public void badSink() throws Throwable
        {
            String password = CWE319_Cleartext_Tx_Sensitive_Info__URLConnection_kerberosKey_68a.password;
    
            if (password != null)
            {
                KerberosPrincipal principal = new KerberosPrincipal("test");
                /* POTENTIAL FLAW: Use password directly in KerberosKey() */
                KerberosKey key = new KerberosKey(principal, password.toCharArray(), null);
                IO.writeLine(key.toString());
            }
    
        }
};