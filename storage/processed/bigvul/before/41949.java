class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            short data = 0;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MIN_VALUE;
    
            goodB2G2PublicStatic = true;
            (new CWE191_Integer_Underflow__short_min_predec_22b()).goodB2G2Sink(data );
        }
};