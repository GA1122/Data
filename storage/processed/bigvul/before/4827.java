class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a value greater than the size of the array */
            data = 100;
    
            int[] dataArray = new int[5];
            dataArray[2] = data;
            (new CWE129_Improper_Validation_of_Array_Index__large_fixed_array_read_no_check_66b()).badSink(dataArray  );
        }
};