class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            StringBuilder data;
    
            switch (6)
            {
            case 6:
                /* FIX: Initialize and use data before it is overwritten */
                data = new StringBuilder("Good");
                IO.writeLine(data.toString());
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
                break;
            }
    
            switch (7)
            {
            case 7:
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = new StringBuilder("Reinitialize");
                IO.writeLine(data.toString());
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};