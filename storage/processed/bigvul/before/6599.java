class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a negative value */
            data = -1;
    
            CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_write_no_check_81_base baseObject = new CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_write_no_check_81_bad();
            baseObject.action(data );
        }
};