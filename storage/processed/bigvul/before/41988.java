class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            short data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MIN_VALUE;
    
            HashMap<Integer,Short> dataHashMap = new HashMap<Integer,Short>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE191_Integer_Underflow__short_min_predec_74b()).goodB2GSink(dataHashMap  );
        }
};