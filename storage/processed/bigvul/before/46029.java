class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* FLAW: Set data to a random value */
            data = (short)((new SecureRandom()).nextInt(Short.MAX_VALUE + 1));
    
            HashMap<Integer,Short> dataHashMap = new HashMap<Integer,Short>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE197_Numeric_Truncation_Error__short_random_74b()).badSink(dataHashMap  );
        }
};