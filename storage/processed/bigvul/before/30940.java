class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            byte data = 0;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MIN_VALUE;
    
            goodB2G1PublicStatic = false;
            (new CWE191_Integer_Underflow__byte_min_postdec_22b()).goodB2G1Sink(data );
        }
};