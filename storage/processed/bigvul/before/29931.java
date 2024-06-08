class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            short data;
            if (IO.STATIC_FINAL_FALSE)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
    
            }
    
            if (IO.STATIC_FINAL_TRUE)
            {
                /* POTENTIAL FLAW: if (data*data) > Short.MAX_VALUE, this will overflow */
                short result = (short)(data * data);
                IO.writeLine("result: " + result);
            }
        }
};