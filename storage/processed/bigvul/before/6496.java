class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int data;
            if (IO.staticFive==5)
            {
                /* POTENTIAL FLAW: Set data to a negative value */
                data = -1;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (IO.staticFive!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
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
        }
};