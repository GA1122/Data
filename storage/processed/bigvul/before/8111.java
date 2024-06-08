class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data;
    
            while (true)
            {
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
                break;
            }
    
            while (true)
            {
                int array[] = null;
                /* POTENTIAL FLAW: Verify that data is non-negative, but still allow it to be 0 */
                if (data >= 0)
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
                break;
            }
    
        }
};