class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            goodB2G2PublicStatic = true;
            (new CWE129_Improper_Validation_of_Array_Index__random_array_read_check_min_22b()).goodB2G2Sink(data );
        }
};