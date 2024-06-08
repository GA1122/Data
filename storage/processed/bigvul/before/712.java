class bad_class{
    public void bad() throws Throwable
        {
            int data = (new CWE129_Improper_Validation_of_Array_Index__connect_tcp_array_size_61b()).badSource();
    
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