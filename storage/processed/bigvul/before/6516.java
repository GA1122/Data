class goodB2G2Sink_class{
    private void goodB2G2Sink(int data ) throws Throwable
        {
            if (goodB2G2Private)
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