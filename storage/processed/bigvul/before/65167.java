class bad_class{
    public void bad() throws Throwable
        {
            Integer data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            dataBad = data;
            badSink();
        }
};