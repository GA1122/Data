class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data = (new CWE129_Improper_Validation_of_Array_Index__console_readLine_array_size_61b()).goodB2GSource();
    
            /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
            int array[] = null;
    
            /* FIX: Verify that data is non-negative AND greater than 0 */
            if (data > 0)
            {
                array = new int[data];
            }
            else
            {
                IO.writeLine("Array size is negative");
            }
    
            /* do something with the array */
            array[0] = 5;
            IO.writeLine(array[0]);
    
        }
};