class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = new StringBuilder("Good");
    
            CWE563_Unused_Variable__unused_value_StringBuilder_81_base baseObject = new CWE563_Unused_Variable__unused_value_StringBuilder_81_goodB2G();
            baseObject.action(data );
        }
};