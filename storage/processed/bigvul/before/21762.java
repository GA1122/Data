class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MAX_VALUE;
    
            goodB2G1PublicStatic = false;
            (new CWE190_Integer_Overflow__int_max_multiply_22b()).goodB2G1Sink(data );
        }
};