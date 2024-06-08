class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            int[] dataArray = new int[5];
            dataArray[2] = data;
            (new CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_read_no_check_66b()).goodG2BSink(dataArray  );
        }
};