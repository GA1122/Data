class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            long data;
    
            while (true)
            {
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
                long result = (long)(++data);
                IO.writeLine("result: " + result);
                break;
            }
    
        }
};