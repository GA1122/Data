class bad_class{
    public void bad() throws Throwable
        {
            byte data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MAX_VALUE;
    
            HashMap<Integer,Byte> dataHashMap = new HashMap<Integer,Byte>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE190_Integer_Overflow__byte_max_square_74b()).badSink(dataHashMap  );
        }
};