class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a negative value */
            data = -1;
    
            Vector<Integer> dataVector = new Vector<Integer>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_read_no_check_72b()).badSink(dataVector  );
        }
};