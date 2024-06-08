class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            Integer data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            HashMap<Integer,Integer> dataHashMap = new HashMap<Integer,Integer>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE476_NULL_Pointer_Dereference__Integer_74b()).goodB2GSink(dataHashMap  );
        }
};