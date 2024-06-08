class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            byte data = 0;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            goodG2BPublicStatic = true;
            (new CWE190_Integer_Overflow__byte_rand_square_22b()).goodG2BSink(data );
        }
};