class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MAX_VALUE;
    
            goodB2G1Private = false;
            goodB2G1Sink(data );
        }
};