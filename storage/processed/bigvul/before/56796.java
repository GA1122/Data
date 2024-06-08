class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data = 0;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            goodG2BPublicStatic = true;
            (new CWE369_Divide_by_Zero__int_zero_modulo_22b()).goodG2BSink(data );
        }
};