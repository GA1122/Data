class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            long data = 0L;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MAX_VALUE;
    
            goodB2G1PublicStatic = false;
            (new CWE190_Integer_Overflow__long_max_postinc_22b()).goodB2G1Sink(data );
        }
};