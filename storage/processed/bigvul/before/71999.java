class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data = (new CWE690_NULL_Deref_From_Return__System_getProperty_equals_61b()).goodB2GSource();
    
            /* FIX: call equals() on string literal (that is not null) */
            if("CWE690".equals(data))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};