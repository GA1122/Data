class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Set data to a negative value */
            data = -1;
    
            goodB2G1PublicStatic = false;
            (new CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_read_check_max_22b()).goodB2G1Sink(data );
        }
};