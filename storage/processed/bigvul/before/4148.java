class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            int data = CWE129_Improper_Validation_of_Array_Index__File_array_read_no_check_68a.data;
    
            /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
            int array[] = { 0, 1, 2, 3, 4 };
    
            /* FIX: Verify index before reading from array at location data */
            if (data >= 0 && data < array.length)
            {
                IO.writeLine(array[data]);
            }
            else
            {
                IO.writeLine("Array index out of bounds");
            }
    
        }
};