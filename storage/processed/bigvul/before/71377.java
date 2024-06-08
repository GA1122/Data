class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            StringBuilder data;
    
            /* FIX: call getStringBuilderGood(), which will never return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderGood();
    
            StringBuilder[] dataArray = new StringBuilder[5];
            dataArray[2] = data;
            (new CWE690_NULL_Deref_From_Return__Class_StringBuilder_66b()).goodG2BSink(dataArray  );
        }
};