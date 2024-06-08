class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            long data;
            if (IO.STATIC_FINAL_FIVE!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0L;
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
    
            }
    
            if (IO.STATIC_FINAL_FIVE==5)
            {
                /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
                long result = (long)(data - 1);
                IO.writeLine("result: " + result);
            }
        }
};