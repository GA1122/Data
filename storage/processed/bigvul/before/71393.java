class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: Call getStringBuilderBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderBad();
    
            HashMap<Integer,StringBuilder> dataHashMap = new HashMap<Integer,StringBuilder>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE690_NULL_Deref_From_Return__Class_StringBuilder_74b()).badSink(dataHashMap  );
        }
};