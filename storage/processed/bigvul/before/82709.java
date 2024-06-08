class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            goodB2G1Private = false;
            goodB2G1Sink(data );
        }
};