class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            StringBuilder data = null;
    
            /* FIX: call getStringBuilderGood(), which will never return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderGood();
    
            goodG2BPublicStatic = true;
            (new CWE690_NULL_Deref_From_Return__Class_StringBuilder_22b()).goodG2BSink(data );
        }
};