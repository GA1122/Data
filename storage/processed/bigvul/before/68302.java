class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded int as a string */
            data = "5";
    
            HashMap<Integer,String> dataHashMap = new HashMap<Integer,String>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE606_Unchecked_Loop_Condition__database_74b()).goodG2BSink(dataHashMap  );
        }
};