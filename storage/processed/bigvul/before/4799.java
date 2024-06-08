class bad_class{
    public void bad() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Set data to a value greater than the size of the array */
            data = 100;
    
            badPublicStatic = true;
            (new CWE129_Improper_Validation_of_Array_Index__large_fixed_array_read_no_check_22b()).badSink(data );
        }
};