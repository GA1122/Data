class goodB2GSink_class{
    public void goodB2GSink(CWE690_NULL_Deref_From_Return__System_getProperty_equals_67a.Container dataContainer ) throws Throwable
        {
            String data = dataContainer.containerOne;
    
            /* FIX: call equals() on string literal (that is not null) */
            if("CWE690".equals(data))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};