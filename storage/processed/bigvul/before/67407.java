class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
            if (privateReturnsTrue())
            {
                /* POTENTIAL FLAW: Initialize, but do not use data */
                data = new StringBuilder("Good");
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (privateReturnsTrue())
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = new StringBuilder("Reinitialize");
                IO.writeLine(data.toString());
            }
        }
};