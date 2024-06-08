class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            CWE129_Improper_Validation_of_Array_Index__random_array_size_81_base baseObject = new CWE129_Improper_Validation_of_Array_Index__random_array_size_81_bad();
            baseObject.action(data );
        }
};