class bad_class{
    public void bad() throws Throwable
        {
            float data;
    
            data = 0.0f; /* POTENTIAL FLAW: data is set to zero */
    
            HashMap<Integer,Float> dataHashMap = new HashMap<Integer,Float>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE369_Divide_by_Zero__float_zero_divide_74b()).badSink(dataHashMap  );
        }
};