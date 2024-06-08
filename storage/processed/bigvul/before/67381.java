class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            StringBuilder data;
            if (true)
            {
                /* FIX: Initialize and use data before it is overwritten */
                data = new StringBuilder("Good");
                IO.writeLine(data.toString());
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (true)
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = new StringBuilder("Reinitialize");
                IO.writeLine(data.toString());
            }
        }
};