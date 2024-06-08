class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            long data = 0L;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            goodG2BPublicStatic = true;
            (new CWE191_Integer_Underflow__long_min_predec_22b()).goodG2BSink(data );
        }
};