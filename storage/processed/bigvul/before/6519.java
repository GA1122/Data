class bad_class{
    public void bad() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Set data to a negative value */
            data = -1;
    
            badPublicStatic = true;
            (new CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_write_no_check_22b()).badSink(data );
        }
};