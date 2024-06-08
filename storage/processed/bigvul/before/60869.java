class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
            count = Integer.MAX_VALUE;
    
            goodB2G1Private = false;
            goodB2G1Sink(count );
        }
};