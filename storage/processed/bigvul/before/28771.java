class bad_class{
    public void bad() throws Throwable
        {
            short data = 0;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MAX_VALUE;
    
            badPublicStatic = true;
            (new CWE190_Integer_Overflow__short_max_multiply_22b()).badSink(data );
        }
};