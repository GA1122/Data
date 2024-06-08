class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            short data = 0;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MIN_VALUE;
    
            goodB2G1PublicStatic = false;
            (new CWE191_Integer_Underflow__short_min_multiply_22b()).goodB2G1Sink(data );
        }
};