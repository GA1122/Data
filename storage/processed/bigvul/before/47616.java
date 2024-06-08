class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            String data;
    
            goodG2B2_private = true;
            data = goodG2B2_source();
    
            if (data != null)
            {
                KerberosPrincipal principal = new KerberosPrincipal("test");
                /* POTENTIAL FLAW: data used as password in KerberosKey() */
                KerberosKey key = new KerberosKey(principal, data.toCharArray(), null);
                IO.writeLine(key.toString());
            }
    
        }
};