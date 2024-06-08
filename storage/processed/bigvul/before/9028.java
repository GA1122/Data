class badSink_class{
    public void badSink(CWE129_Improper_Validation_of_Array_Index__random_array_size_67a.Container dataContainer ) throws Throwable
        {
            int data = dataContainer.containerOne;
    
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