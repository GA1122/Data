class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int [] data;
    
            /* FIX: hardcode data to non-null */
            data = new int[5];
    
            HashMap<Integer,int []> dataHashMap = new HashMap<Integer,int []>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE476_NULL_Pointer_Dereference__int_array_74b()).goodG2BSink(dataHashMap  );
        }
};