class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            String data = null;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            goodB2G2PublicStatic = true;
            (new CWE643_Xpath_Injection__Environment_22b()).goodB2G2Sink(data );
        }
};