class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = "Good";
    
            CWE563_Unused_Variable__unused_init_variable_String_81_base baseObject = new CWE563_Unused_Variable__unused_init_variable_String_81_goodB2G();
            baseObject.action(data );
        }
};