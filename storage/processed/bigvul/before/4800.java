class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Set data to a value greater than the size of the array */
            data = 100;
    
            goodB2G1PublicStatic = false;
            (new CWE129_Improper_Validation_of_Array_Index__large_fixed_array_read_no_check_22b()).goodB2G1Sink(data );
        }
};