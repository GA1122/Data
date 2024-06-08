class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            int data;
            if (5!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
    
            }
    
            if (5==5)
            {
                /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
                int array[] = { 0, 1, 2, 3, 4 };
                /* POTENTIAL FLAW: Attempt to write to array at location data, which may be outside the array bounds */
                array[data] = 42;
                /* Skip reading back data from array since that may be another out of bounds operation */
            }
        }
};