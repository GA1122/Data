class badSink_class{
    public void badSink(Object dataObject ) throws Throwable
        {
            int data = (Integer)dataObject;
    
            /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
            int array[] = { 0, 1, 2, 3, 4 };
    
            /* POTENTIAL FLAW: Attempt to write to array at location data, which may be outside the array bounds */
            array[data] = 42;
    
            /* Skip reading back data from array since that may be another out of bounds operation */
    
        }
};