class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* FLAW: Use a number larger than Short.MAX_VALUE */
            data = Short.MAX_VALUE + 5;
    
            CWE197_Numeric_Truncation_Error__int_large_to_short_81_base baseObject = new CWE197_Numeric_Truncation_Error__int_large_to_short_81_bad();
            baseObject.action(data );
        }
};