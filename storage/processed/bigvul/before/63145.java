class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int count;
    
            while (true)
            {
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                count = 2;
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: Use count as the input to Thread.sleep() */
                Thread.sleep(count);
                break;
            }
    
        }
};