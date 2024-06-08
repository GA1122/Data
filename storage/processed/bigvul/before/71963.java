class bad_class{
    public void bad() throws Throwable
        {
            String data = null;
    
            /* POTENTIAL FLAW: data may be set to null */
            data = System.getProperty("CWE690");
    
            badPublicStatic = true;
            (new CWE690_NULL_Deref_From_Return__System_getProperty_equals_22b()).badSink(data );
        }
};