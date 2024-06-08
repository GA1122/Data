class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            long data;
    
            switch (6)
            {
            case 6:
                /* FIX: Initialize and use data before it is overwritten */
                data = 5L;
                IO.writeLine("" + data);
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
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = 10L;
                IO.writeLine("" + data);
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};