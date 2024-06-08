class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            long data = 0L;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            goodG2BPublicStatic = true;
            (new CWE190_Integer_Overflow__long_rand_postinc_22b()).goodG2BSink(data );
        }
};