class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: data may be set to null */
            data = System.getProperty("CWE690");
    
            CWE690_NULL_Deref_From_Return__System_getProperty_trim_81_base baseObject = new CWE690_NULL_Deref_From_Return__System_getProperty_trim_81_goodB2G();
            baseObject.action(data );
        }
};