class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            CWE129_Improper_Validation_of_Array_Index__random_array_read_no_check_81_base baseObject = new CWE129_Improper_Validation_of_Array_Index__random_array_read_no_check_81_goodB2G();
            baseObject.action(data );
        }
};