class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data = null;
    
            /* POTENTIAL FLAW: Call getStringBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBad();
    
            goodB2G1PublicStatic = false;
            (new CWE690_NULL_Deref_From_Return__Class_String_22b()).goodB2G1Sink(data );
        }
};