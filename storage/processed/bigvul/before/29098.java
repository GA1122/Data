class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            short data = 0;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MAX_VALUE;
    
            goodB2G1PublicStatic = false;
            (new CWE190_Integer_Overflow__short_max_preinc_22b()).goodB2G1Sink(data );
        }
};