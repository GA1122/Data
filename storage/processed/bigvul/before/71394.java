class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: Call getStringBuilderBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderBad();
    
            HashMap<Integer,StringBuilder> dataHashMap = new HashMap<Integer,StringBuilder>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE690_NULL_Deref_From_Return__Class_StringBuilder_74b()).goodB2GSink(dataHashMap  );
        }
};