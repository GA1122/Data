class bad_class{
    public void bad() throws Throwable
        {
            long data = 0L;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MAX_VALUE;
    
            badPublicStatic = true;
            (new CWE190_Integer_Overflow__long_max_square_22b()).badSink(data );
        }
};