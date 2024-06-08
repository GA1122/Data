class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data = (new CWE129_Improper_Validation_of_Array_Index__PropertiesFile_array_read_check_min_61b()).goodG2BSource();
    
            /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
            int array[] = { 0, 1, 2, 3, 4 };
    
            /* POTENTIAL FLAW: Verify that data >= 0, but don't verify that data < array.length, so may be attempting to read out of the array bounds */
            if (data >= 0)
            {
                IO.writeLine(array[data]);
            }
            else
            {
                IO.writeLine("Array index out of bounds");
            }
    
        }
};