class goodB2GSink_class{
    public void goodB2GSink(Object dataObject ) throws Throwable
        {
            int data = (Integer)dataObject;
    
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
};