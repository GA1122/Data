class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            String data = null;
    
            /* POTENTIAL FLAW: data may be set to null */
            data = System.getProperty("CWE690");
    
            goodB2G2PublicStatic = true;
            (new CWE690_NULL_Deref_From_Return__System_getProperty_equals_22b()).goodB2G2Sink(data );
        }
};