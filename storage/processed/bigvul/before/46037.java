class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* FLAW: Set data to a random value */
            data = (short)((new SecureRandom()).nextInt(Short.MAX_VALUE + 1));
    
            CWE197_Numeric_Truncation_Error__short_random_81_base baseObject = new CWE197_Numeric_Truncation_Error__short_random_81_bad();
            baseObject.action(data );
        }
};