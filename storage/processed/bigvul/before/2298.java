class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data = 0;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            goodG2BPublicStatic = true;
            (new CWE129_Improper_Validation_of_Array_Index__database_array_read_no_check_22b()).goodG2BSink(data );
        }
};