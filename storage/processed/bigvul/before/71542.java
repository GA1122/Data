class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: Call getStringBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBad();
    
            CWE690_NULL_Deref_From_Return__Class_String_81_base baseObject = new CWE690_NULL_Deref_From_Return__Class_String_81_goodB2G();
            baseObject.action(data );
        }
};