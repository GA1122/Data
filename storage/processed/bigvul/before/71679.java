class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Set data to a fixed, non-null String */
            data = "CWE690";
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE690_NULL_Deref_From_Return__Properties_getProperty_equals_66b()).goodG2BSink(dataArray  );
        }
};