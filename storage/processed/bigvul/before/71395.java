class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            StringBuilder data;
    
            /* FIX: call getStringBuilderGood(), which will never return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderGood();
    
            HashMap<Integer,StringBuilder> dataHashMap = new HashMap<Integer,StringBuilder>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE690_NULL_Deref_From_Return__Class_StringBuilder_74b()).goodG2BSink(dataHashMap  );
        }
};