class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data = null;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            goodB2G1PublicStatic = false;
            (new CWE606_Unchecked_Loop_Condition__Property_22b()).goodB2G1Sink(data );
        }
};