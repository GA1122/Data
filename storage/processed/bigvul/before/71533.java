class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: call getStringGood(), which will never return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringGood();
    
            HashMap<Integer,String> dataHashMap = new HashMap<Integer,String>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE690_NULL_Deref_From_Return__Class_String_74b()).goodG2BSink(dataHashMap  );
        }
};