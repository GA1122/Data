class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MIN_VALUE;
    
            HashMap<Integer,Long> dataHashMap = new HashMap<Integer,Long>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE191_Integer_Underflow__long_min_postdec_74b()).badSink(dataHashMap  );
        }
};