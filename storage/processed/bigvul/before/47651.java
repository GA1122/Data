class badSink_class{
    public void badSink(CWE259_Hard_Coded_Password__kerberosKey_67a.Container dataContainer ) throws Throwable
        {
            String data = dataContainer.containerOne;
    
            if (data != null)
            {
                KerberosPrincipal principal = new KerberosPrincipal("test");
                /* POTENTIAL FLAW: data used as password in KerberosKey() */
                KerberosKey key = new KerberosKey(principal, data.toCharArray(), null);
                IO.writeLine(key.toString());
            }
    
        }
};