class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            goodB2G2Private = true;
            goodB2G2Sink(data );
        }
};