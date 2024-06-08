class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            String data;
            if (IO.staticFive==5)
            {
                /* FIX: Initialize and use data before it is overwritten */
                data = "Good";
                IO.writeLine(data);
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (IO.staticFive==5)
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = "Reinitialize";
                IO.writeLine(data);
            }
        }
};