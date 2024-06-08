class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            short data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            CWE197_Numeric_Truncation_Error__short_Environment_81_base baseObject = new CWE197_Numeric_Truncation_Error__short_Environment_81_goodG2B();
            baseObject.action(data );
        }
};