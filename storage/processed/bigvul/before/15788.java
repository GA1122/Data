class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            byte data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MAX_VALUE;
    
            HashMap<Integer,Byte> dataHashMap = new HashMap<Integer,Byte>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE190_Integer_Overflow__byte_max_preinc_74b()).goodB2GSink(dataHashMap  );
        }
};