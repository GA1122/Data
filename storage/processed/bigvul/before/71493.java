class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            String data = null;
    
            /* POTENTIAL FLAW: Call getStringBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBad();
    
            goodB2G2PublicStatic = true;
            (new CWE690_NULL_Deref_From_Return__Class_String_22b()).goodB2G2Sink(data );
        }
};