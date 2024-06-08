class bad_class{
    public void bad() throws Throwable
        {
            int data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Set data to a negative value */
                data = -1;
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
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