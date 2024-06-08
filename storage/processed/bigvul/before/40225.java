class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            long data = 0L;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MIN_VALUE;
    
            goodB2G2PublicStatic = true;
            (new CWE191_Integer_Underflow__long_min_sub_22b()).goodB2G2Sink(data );
        }
};