class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MAX_VALUE;
    
            goodB2G1Private = false;
            goodB2G1Sink(data );
        }
};