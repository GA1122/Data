class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            long data;
    
            switch (6)
            {
            case 6:
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0L;
                break;
            }
    
            switch (7)
            {
            case 7:
                /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
                long result = (long)(data + 1);
                IO.writeLine("result: " + result);
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};