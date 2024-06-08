class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            CWE606_Unchecked_Loop_Condition__Property_81_base baseObject = new CWE606_Unchecked_Loop_Condition__Property_81_bad();
            baseObject.action(data );
        }
};