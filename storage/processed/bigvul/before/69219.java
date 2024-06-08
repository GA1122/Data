class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            CWE606_Unchecked_Loop_Condition__Property_81_base baseObject = new CWE606_Unchecked_Loop_Condition__Property_81_goodB2G();
            baseObject.action(data );
        }
};