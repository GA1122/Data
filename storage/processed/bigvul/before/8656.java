class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            goodB2G1PublicStatic = false;
            (new CWE129_Improper_Validation_of_Array_Index__random_array_read_check_min_22b()).goodB2G1Sink(data );
        }
};