class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            long data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            dataGoodG2B = data;
            goodG2BSink();
        }
};