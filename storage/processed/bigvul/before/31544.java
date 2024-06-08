class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            byte data = 0;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            goodG2BPublicStatic = true;
            (new CWE191_Integer_Underflow__byte_rand_postdec_22b()).goodG2BSink(data );
        }
};