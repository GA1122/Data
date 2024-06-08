class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: data may be set to null */
            data = System.getProperty("CWE690");
    
            goodB2G2Private = true;
            goodB2G2Sink(data );
        }
};