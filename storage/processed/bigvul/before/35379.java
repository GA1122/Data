class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            int data;
            if (PRIVATE_STATIC_FINAL_TRUE)
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
    
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
                data--;
                int result = (int)(data);
                IO.writeLine("result: " + result);
            }
        }
};