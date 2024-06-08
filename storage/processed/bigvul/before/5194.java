class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a value greater than the size of the array */
            data = 100;
    
            HashMap<Integer,Integer> dataHashMap = new HashMap<Integer,Integer>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE129_Improper_Validation_of_Array_Index__large_fixed_array_write_no_check_74b()).goodB2GSink(dataHashMap  );
        }
};