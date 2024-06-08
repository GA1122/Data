class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            String data;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            goodB2G2Private = true;
            goodB2G2Sink(data );
        }
};