class bad_class{
    public void bad() throws Throwable
        {
            int [] data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            dataBad = data;
            badSink();
        }
};