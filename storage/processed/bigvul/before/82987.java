class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            CWE89_SQL_Injection__Property_execute_81_base baseObject = new CWE89_SQL_Injection__Property_execute_81_bad();
            baseObject.action(data );
        }
};