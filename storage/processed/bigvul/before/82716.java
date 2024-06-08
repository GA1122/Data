class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data = null;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            goodB2G1PublicStatic = false;
            (new CWE89_SQL_Injection__Property_executeUpdate_22b()).goodB2G1Sink(data );
        }
};