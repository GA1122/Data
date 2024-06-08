class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            short data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            CWE191_Integer_Underflow__short_rand_sub_81_base baseObject = new CWE191_Integer_Underflow__short_rand_sub_81_goodG2B();
            baseObject.action(data );
        }
};