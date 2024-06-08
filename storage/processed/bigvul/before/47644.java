class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data = (new CWE259_Hard_Coded_Password__kerberosKey_61b()).goodG2BSource();
    
            if (data != null)
            {
                KerberosPrincipal principal = new KerberosPrincipal("test");
                /* POTENTIAL FLAW: data used as password in KerberosKey() */
                KerberosKey key = new KerberosKey(principal, data.toCharArray(), null);
                IO.writeLine(key.toString());
            }
    
        }
};