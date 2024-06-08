class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            goodB2G1Private = false;
            goodB2G1Sink(data );
        }
};