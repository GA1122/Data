class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            String data = CWE690_NULL_Deref_From_Return__Properties_getProperty_equals_68a.data;
    
            /* FIX: call equals() on string literal (that is not null) */
            if("CWE690".equals(data))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};