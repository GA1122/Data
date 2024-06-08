class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            byte data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MIN_VALUE;
    
            goodB2G2Private = true;
            goodB2G2Sink(data );
        }
};