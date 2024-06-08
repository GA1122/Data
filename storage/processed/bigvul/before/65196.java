class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            Integer data;
    
            /* FIX: hardcode data to non-null */
            data = Integer.valueOf(5);
    
            HashMap<Integer,Integer> dataHashMap = new HashMap<Integer,Integer>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE476_NULL_Pointer_Dereference__Integer_74b()).goodG2BSink(dataHashMap  );
        }
};