class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            CWE129_Improper_Validation_of_Array_Index__Environment_array_write_no_check_81_base baseObject = new CWE129_Improper_Validation_of_Array_Index__Environment_array_write_no_check_81_goodG2B();
            baseObject.action(data );
        }
};