class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* FLAW: Set data to Integer.MAX_VALUE */
            data = Integer.MAX_VALUE;
    
            HashMap<Integer,Integer> dataHashMap = new HashMap<Integer,Integer>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE789_Uncontrolled_Mem_Alloc__max_value_ArrayList_74b()).badSink(dataHashMap  );
        }
};