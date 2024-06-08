class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a value greater than the size of the array */
            data = 100;
    
            for (int k = 0; k < 1; k++)
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