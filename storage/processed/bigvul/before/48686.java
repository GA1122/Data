class badSink_class{
    public void badSink(CWE319_Cleartext_Tx_Sensitive_Info__listen_tcp_kerberosKey_67a.Container passwordContainer ) throws Throwable
        {
            String password = passwordContainer.containerOne;
    
            if (password != null)
            {
                KerberosPrincipal principal = new KerberosPrincipal("test");
                /* POTENTIAL FLAW: Use password directly in KerberosKey() */
                KerberosKey key = new KerberosKey(principal, password.toCharArray(), null);
                IO.writeLine(key.toString());
            }
    
        }
};