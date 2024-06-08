class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* FLAW: Use a number larger than Byte.MAX_VALUE */
            data = Byte.MAX_VALUE + 5;
    
            CWE197_Numeric_Truncation_Error__short_large_81_base baseObject = new CWE197_Numeric_Truncation_Error__short_large_81_bad();
            baseObject.action(data );
        }
};