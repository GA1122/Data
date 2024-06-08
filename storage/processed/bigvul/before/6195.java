class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Set data to a negative value */
            data = -1;
    
            goodB2G2PublicStatic = true;
            (new CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_read_check_max_22b()).goodB2G2Sink(data );
        }
};