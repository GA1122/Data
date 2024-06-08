class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Set data to a value greater than the size of the array */
            data = 100;
    
            goodB2G2PublicStatic = true;
            (new CWE129_Improper_Validation_of_Array_Index__large_fixed_array_read_no_check_22b()).goodB2G2Sink(data );
        }
};