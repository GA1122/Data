class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data = null;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            goodB2G1PublicStatic = false;
            (new CWE89_SQL_Injection__Environment_prepareStatement_22b()).goodB2G1Sink(data );
        }
};