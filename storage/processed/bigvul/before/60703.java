class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
            count = Integer.MAX_VALUE;
    
            goodB2G2Private = true;
            goodB2G2Sink(count );
        }
};