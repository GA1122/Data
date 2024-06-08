class badSink_class{
    public void badSink() throws Throwable
        {
            int data = CWE129_Improper_Validation_of_Array_Index__PropertiesFile_array_read_check_max_68a.data;
    
            /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
            int array[] = { 0, 1, 2, 3, 4 };
    
            /* POTENTIAL FLAW: Verify that data < array.length, but don't verify that data > 0, so may be attempting to read out of the array bounds */
            if (data < array.length)
            {
                IO.writeLine(array[data]);
            }
            else
            {
                IO.writeLine("Array index out of bounds");
            }
    
        }
};