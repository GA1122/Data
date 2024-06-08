class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a value greater than the size of the array */
            data = 100;
    
            goodB2G1Private = false;
            goodB2G1Sink(data );
        }
};