class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            StringBuilder data;
    
            /* FIX: call getStringBuilderGood(), which will never return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderGood();
    
            CWE690_NULL_Deref_From_Return__Class_StringBuilder_81_base baseObject = new CWE690_NULL_Deref_From_Return__Class_StringBuilder_81_goodG2B();
            baseObject.action(data );
        }
};