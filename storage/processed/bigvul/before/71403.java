class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: Call getStringBuilderBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderBad();
    
            CWE690_NULL_Deref_From_Return__Class_StringBuilder_81_base baseObject = new CWE690_NULL_Deref_From_Return__Class_StringBuilder_81_bad();
            baseObject.action(data );
        }
};