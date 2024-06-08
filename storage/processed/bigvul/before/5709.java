class badSink_class{
    public void badSink() throws Throwable
        {
            int data = CWE129_Improper_Validation_of_Array_Index__listen_tcp_array_read_no_check_68a.data;
    
            /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
            int array[] = { 0, 1, 2, 3, 4 };
    
            /* POTENTIAL FLAW: Attempt to read from array at location data, which may be outside the array bounds */
            IO.writeLine(array[data]);
    
        }
};