class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data = null;
    
            /* POTENTIAL FLAW: Call getStringBuilderBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderBad();
    
            badPublicStatic = true;
            (new CWE690_NULL_Deref_From_Return__Class_StringBuilder_22b()).badSink(data );
        }
};