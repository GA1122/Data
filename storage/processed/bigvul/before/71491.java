class bad_class{
    public void bad() throws Throwable
        {
            String data = null;
    
            /* POTENTIAL FLAW: Call getStringBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBad();
    
            badPublicStatic = true;
            (new CWE690_NULL_Deref_From_Return__Class_String_22b()).badSink(data );
        }
};