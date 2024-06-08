class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a negative value */
            data = -1;
    
            HashMap<Integer,Integer> dataHashMap = new HashMap<Integer,Integer>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_read_no_check_74b()).badSink(dataHashMap  );
        }
};