class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data = null;
    
            /* FIX: call getStringGood(), which will never return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringGood();
    
            goodG2BPublicStatic = true;
            (new CWE690_NULL_Deref_From_Return__Class_String_22b()).goodG2BSink(data );
        }
};