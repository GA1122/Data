class badSink_class{
    public void badSink(HashMap<Integer,Integer> dataHashMap ) throws Throwable
        {
            int data = dataHashMap.get(2);
    
            /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
            int array[] = { 0, 1, 2, 3, 4 };
    
            /* POTENTIAL FLAW: Attempt to read from array at location data, which may be outside the array bounds */
            IO.writeLine(array[data]);
    
        }
};