class bad_class{
    public void bad() throws Throwable
        {
            String data;
            if (IO.STATIC_FINAL_FIVE==5)
            {
                /* POTENTIAL FLAW: Initialize, but do not use data */
                data = "Good";
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (IO.STATIC_FINAL_FIVE==5)
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = "Reinitialize";
                IO.writeLine(data);
            }
        }
};