class goodB2G1Sink_class{
    public void goodB2G1Sink(int data ) throws Throwable
        {
            if (CWE129_Improper_Validation_of_Array_Index__database_array_read_check_min_22a.goodB2G1PublicStatic)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
            else
            {
    
                /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
                int array[] = { 0, 1, 2, 3, 4 };
    
                /* FIX: Fully verify data before reading from array at location data */
                if (data >= 0 && data < array.length)
                {
                    IO.writeLine(array[data]);
                }
                else
                {
                    IO.writeLine("Array index out of bounds");
                }
    
            }
        }
};