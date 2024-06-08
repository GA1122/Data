class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            int count;
            if (privateReturnsTrue())
            {
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                count = 2;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure count is inititialized before the Sink to avoid compiler errors */
                count = 0;
            }
    
            if (privateReturnsTrue())
            {
                int i = 0;
                /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
                for (i = 0; i < count; i++)
                {
                    IO.writeLine("Hello");
                }
            }
        }
};