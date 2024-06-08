class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            long data = 0L;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MIN_VALUE;
    
            goodB2G1PublicStatic = false;
            (new CWE191_Integer_Underflow__long_min_postdec_22b()).goodB2G1Sink(data );
        }
};