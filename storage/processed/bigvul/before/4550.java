class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int data;
            if (true)
            {
                /* POTENTIAL FLAW: Set data to a value greater than the size of the array */
                data = 100;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (false)
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