class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* FLAW: Set data to a hardcoded value */
            data = "23 ~j;asn!@#/>as";
    
            dataBad = data;
            badSink();
        }
};