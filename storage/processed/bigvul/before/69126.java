class bad_class{
    public void bad() throws Throwable
        {
            String data = null;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            badPublicStatic = true;
            (new CWE606_Unchecked_Loop_Condition__Property_22b()).badSink(data );
        }
};