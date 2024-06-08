class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a negative value */
            data = -1;
    
            dataBad = data;
            badSink();
        }
};