class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            CWE197_Numeric_Truncation_Error__int_random_to_short_81_base baseObject = new CWE197_Numeric_Truncation_Error__int_random_to_short_81_bad();
            baseObject.action(data );
        }
};