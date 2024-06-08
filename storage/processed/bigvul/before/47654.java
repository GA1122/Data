class badSink_class{
    public void badSink() throws Throwable
        {
            String data = CWE259_Hard_Coded_Password__kerberosKey_68a.data;
    
            if (data != null)
            {
                KerberosPrincipal principal = new KerberosPrincipal("test");
                /* POTENTIAL FLAW: data used as password in KerberosKey() */
                KerberosKey key = new KerberosKey(principal, data.toCharArray(), null);
                IO.writeLine(key.toString());
            }
    
        }
};