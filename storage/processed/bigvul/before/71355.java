class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            StringBuilder data = null;
    
            /* POTENTIAL FLAW: Call getStringBuilderBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderBad();
    
            goodB2G2PublicStatic = true;
            (new CWE690_NULL_Deref_From_Return__Class_StringBuilder_22b()).goodB2G2Sink(data );
        }
};