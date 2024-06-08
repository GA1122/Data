class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data = (new CWE129_Improper_Validation_of_Array_Index__connect_tcp_array_write_no_check_61b()).goodB2GSource();
    
            /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
            int array[] = { 0, 1, 2, 3, 4 };
    
            /* FIX: Verify index before writing to array at location data */
            if (data >= 0 && data < array.length)
            {
                array[data] = 42;
            }
            else
            {
                IO.writeLine("Array index out of bounds");
            }
    
        }
};