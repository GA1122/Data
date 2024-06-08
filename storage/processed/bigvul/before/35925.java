class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MIN_VALUE;
    
            goodB2G2PublicStatic = true;
            (new CWE191_Integer_Underflow__int_min_multiply_22b()).goodB2G2Sink(data );
        }
};