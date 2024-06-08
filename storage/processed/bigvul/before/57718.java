class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            CWE36_Absolute_Path_Traversal__Property_81_base baseObject = new CWE36_Absolute_Path_Traversal__Property_81_bad();
            baseObject.action(data );
        }
};