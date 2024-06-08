class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int dataCopy;
            {
                int data;
    
                /* POTENTIAL FLAW: Set data to a value greater than the size of the array */
                data = 100;
    
                dataCopy = data;
            }
            {
                int data = dataCopy;
    
                /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
                int array[] = null;
    
                /* FIX: Verify that data is non-negative AND greater than 0 */
                if (data > 0)
                {
                    array = new int[data];
                }
                else
                {
                    IO.writeLine("Array size is negative");
                }
    
                /* do something with the array */
                array[0] = 5;
                IO.writeLine(array[0]);
    
            }
        }
};