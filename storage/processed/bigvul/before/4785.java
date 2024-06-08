class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Set data to a value greater than the size of the array */
                data = 100;
                break;
            }
    
            while (true)
            {
                /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
                int array[] = { 0, 1, 2, 3, 4 };
                /* POTENTIAL FLAW: Attempt to read from array at location data, which may be outside the array bounds */
                IO.writeLine(array[data]);
                break;
            }
        }
};