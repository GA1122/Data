class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: Call getStringBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBad();
    
            CWE690_NULL_Deref_From_Return__Class_String_81_base baseObject = new CWE690_NULL_Deref_From_Return__Class_String_81_bad();
            baseObject.action(data );
        }
};