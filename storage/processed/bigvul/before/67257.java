class bad_class{
    public void bad() throws Throwable
        {
            int data;
            if (IO.staticTrue)
            {
                /* POTENTIAL FLAW: Initialize, but do not use data */
                data = 5;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (IO.staticTrue)
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = 10;
                IO.writeLine("" + data);
            }
        }
};