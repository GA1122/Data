class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: hardcode data to non-null */
            data = "This is not null";
    
            HashMap<Integer,String> dataHashMap = new HashMap<Integer,String>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE476_NULL_Pointer_Dereference__String_74b()).goodG2BSink(dataHashMap  );
        }
};