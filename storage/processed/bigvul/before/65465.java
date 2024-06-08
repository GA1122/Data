class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            badPrivate = true;
            badSink(data );
        }
};