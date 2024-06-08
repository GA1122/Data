class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a value greater than the size of the array */
            data = 100;
    
            CWE129_Improper_Validation_of_Array_Index__large_fixed_array_write_no_check_81_base baseObject = new CWE129_Improper_Validation_of_Array_Index__large_fixed_array_write_no_check_81_goodB2G();
            baseObject.action(data );
        }
};