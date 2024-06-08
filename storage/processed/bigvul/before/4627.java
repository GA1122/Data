class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a value greater than the size of the array */
            data = 100;
    
            goodB2G2Private = true;
            goodB2G2Sink(data );
        }
};