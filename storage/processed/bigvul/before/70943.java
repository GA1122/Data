class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            CWE643_Xpath_Injection__Property_81_base baseObject = new CWE643_Xpath_Injection__Property_81_goodB2G();
            baseObject.action(data );
        }
};