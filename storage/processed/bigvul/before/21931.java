class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MAX_VALUE;
    
            goodB2G2PublicStatic = true;
            (new CWE190_Integer_Overflow__int_max_postinc_22b()).goodB2G2Sink(data );
        }
};