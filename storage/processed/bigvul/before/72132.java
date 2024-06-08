class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data = null;
    
            /* POTENTIAL FLAW: data may be set to null */
            data = System.getProperty("CWE690");
    
            goodB2G1PublicStatic = false;
            (new CWE690_NULL_Deref_From_Return__System_getProperty_trim_22b()).goodB2G1Sink(data );
        }
};