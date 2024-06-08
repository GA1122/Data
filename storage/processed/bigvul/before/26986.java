class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MAX_VALUE;
    
            HashMap<Integer,Long> dataHashMap = new HashMap<Integer,Long>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE190_Integer_Overflow__long_max_square_74b()).goodB2GSink(dataHashMap  );
        }
};