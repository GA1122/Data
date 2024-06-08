class goodG2BSink_class{
    public void goodG2BSink(Vector<String> dataVector ) throws Throwable
        {
            String data = dataVector.remove(2);
    
            if (data != null)
            {
                KerberosPrincipal principal = new KerberosPrincipal("test");
                /* POTENTIAL FLAW: data used as password in KerberosKey() */
                KerberosKey key = new KerberosKey(principal, data.toCharArray(), null);
                IO.writeLine(key.toString());
            }
    
        }
};