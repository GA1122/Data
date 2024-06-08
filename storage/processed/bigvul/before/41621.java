class bad_class{
    public void bad() throws Throwable
        {
            short data = 0;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MIN_VALUE;
    
            badPublicStatic = true;
            (new CWE191_Integer_Underflow__short_min_multiply_22b()).badSink(data );
        }
};