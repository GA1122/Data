class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: call getStringGood(), which will never return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringGood();
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE690_NULL_Deref_From_Return__Class_String_66b()).goodG2BSink(dataArray  );
        }
};