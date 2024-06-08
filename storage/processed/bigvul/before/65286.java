class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int [] data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            goodB2G1Private = false;
            goodB2G1Sink(data );
        }
};