class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            StringBuilder data;
    
            /* FIX: call getStringBuilderGood(), which will never return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderGood();
    
            dataGoodG2B = data;
            goodG2BSink();
        }
};