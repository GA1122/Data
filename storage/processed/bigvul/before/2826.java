class goodB2G1Sink_class{
    private void goodB2G1Sink(int data ) throws Throwable
        {
            if (goodB2G1Private)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
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