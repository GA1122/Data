class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            byte data;
            if (IO.STATIC_FINAL_TRUE)
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
    
            if (IO.STATIC_FINAL_TRUE)
            {
                /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
                byte result = (byte)(++data);
                IO.writeLine("result: " + result);
            }
        }
};