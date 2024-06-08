class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int count;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            count = 2;
    
            countGoodG2B = count;
            goodG2BSink();
        }
};