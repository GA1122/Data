class bad_class{
    public void bad() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            badPublicStatic = true;
            (new CWE129_Improper_Validation_of_Array_Index__random_array_read_check_max_22b()).badSink(data );
        }
};