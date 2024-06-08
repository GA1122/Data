class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            byte data = 0;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MAX_VALUE;
    
            goodB2G2PublicStatic = true;
            (new CWE190_Integer_Overflow__byte_max_square_22b()).goodB2G2Sink(data );
        }
};