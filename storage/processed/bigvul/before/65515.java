class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            StringBuilder data;
    
            /* FIX: hardcode data to non-null */
            data = new StringBuilder();
    
            HashMap<Integer,StringBuilder> dataHashMap = new HashMap<Integer,StringBuilder>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE476_NULL_Pointer_Dereference__StringBuilder_74b()).goodG2BSink(dataHashMap  );
        }
};