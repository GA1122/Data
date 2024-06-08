class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            HashMap<Integer,StringBuilder> dataHashMap = new HashMap<Integer,StringBuilder>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE476_NULL_Pointer_Dereference__StringBuilder_74b()).badSink(dataHashMap  );
        }
};