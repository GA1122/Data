class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            switch (6)
            {
            case 6:
                /* POTENTIAL FLAW: Initialize, but do not use data */
                data = "Good";
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
                data = "Reinitialize";
                IO.writeLine(data);
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};