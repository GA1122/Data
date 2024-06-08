class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MIN_VALUE;
    
            goodB2G1PublicStatic = false;
            (new CWE191_Integer_Underflow__int_min_postdec_22b()).goodB2G1Sink(data );
        }
};