class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            byte data = 0;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MIN_VALUE;
    
            goodB2G2PublicStatic = true;
            (new CWE191_Integer_Underflow__byte_min_sub_22b()).goodB2G2Sink(data );
        }
};