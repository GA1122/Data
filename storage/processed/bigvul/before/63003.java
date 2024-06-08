class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            int count;
    
            switch (5)
            {
            case 6:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure count is inititialized before the Sink to avoid compiler errors */
                count = 0;
                break;
            default:
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                count = 2;
                break;
            }
    
            switch (7)
            {
            case 7:
                /* POTENTIAL FLAW: Use count as the input to Thread.sleep() */
                Thread.sleep(count);
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};