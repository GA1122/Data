class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            String data = null;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            goodB2G2PublicStatic = true;
            (new CWE89_SQL_Injection__Property_executeUpdate_22b()).goodB2G2Sink(data );
        }
};