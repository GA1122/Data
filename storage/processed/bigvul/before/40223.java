class bad_class{
    public void bad() throws Throwable
        {
            long data = 0L;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MIN_VALUE;
    
            badPublicStatic = true;
            (new CWE191_Integer_Underflow__long_min_sub_22b()).badSink(data );
        }
};