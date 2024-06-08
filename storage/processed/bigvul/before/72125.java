class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: data may be set to null */
            data = System.getProperty("CWE690");
    
            goodB2G1Private = false;
            goodB2G1Sink(data );
        }
};