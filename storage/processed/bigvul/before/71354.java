class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            StringBuilder data = null;
    
            /* POTENTIAL FLAW: Call getStringBuilderBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderBad();
    
            goodB2G1PublicStatic = false;
            (new CWE690_NULL_Deref_From_Return__Class_StringBuilder_22b()).goodB2G1Sink(data );
        }
};