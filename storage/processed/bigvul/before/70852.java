class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            String data = null;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            goodB2G2PublicStatic = true;
            (new CWE643_Xpath_Injection__Property_22b()).goodB2G2Sink(data );
        }
};