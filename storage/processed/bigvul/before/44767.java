class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            int data;
            if (5 == 5)
            {
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            {
                /* POTENTIAL FLAW: Convert data to a short, possibly causing a truncation error */
                IO.writeLine((short)data);
            }
    
        }
};