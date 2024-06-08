class goodG2BSink_class{
    public void goodG2BSink(int data ) throws Throwable
        {
            if (CWE129_Improper_Validation_of_Array_Index__connect_tcp_array_size_22a.goodG2BPublicStatic)
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
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
        }
};