class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            long data = 0L;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MAX_VALUE;
    
            goodB2G2PublicStatic = true;
            (new CWE190_Integer_Overflow__long_max_multiply_22b()).goodB2G2Sink(data );
        }
};