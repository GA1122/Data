class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            CWE134_Uncontrolled_Format_String__Property_printf_81_base baseObject = new CWE134_Uncontrolled_Format_String__Property_printf_81_goodB2G();
            baseObject.action(data );
        }
};