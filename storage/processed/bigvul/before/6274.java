class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a negative value */
            data = -1;
    
            CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_read_check_max_81_base baseObject = new CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_read_check_max_81_goodB2G();
            baseObject.action(data );
        }
};