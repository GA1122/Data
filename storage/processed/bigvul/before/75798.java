class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            CWE78_OS_Command_Injection__Property_81_base baseObject = new CWE78_OS_Command_Injection__Property_81_bad();
            baseObject.action(data );
        }
};