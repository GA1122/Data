class bad_class{
    public void bad() throws Throwable
        {
            String dataCopy;
            {
                String data;
    
                /* FLAW: Set data to a hardcoded string */
                data = "7e5tc4s3";
    
                dataCopy = data;
            }
            {
                String data = dataCopy;
    
                if (data != null)
                {
                    KerberosPrincipal principal = new KerberosPrincipal("test");
                    /* POTENTIAL FLAW: data used as password in KerberosKey() */
                    KerberosKey key = new KerberosKey(principal, data.toCharArray(), null);
                    IO.writeLine(key.toString());
                }
    
            }
        }
};