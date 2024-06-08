class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data = (new CWE129_Improper_Validation_of_Array_Index__URLConnection_array_size_61b()).goodG2BSource();
    
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
    
        }
};