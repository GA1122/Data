class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            StringBuilder data;
            if (IO.staticFive!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
            else
            {
    
                /* FIX: Initialize and use data before it is overwritten */
    
                data = new StringBuilder("Good");
    
                IO.writeLine(data.toString());
    
            }
    
            if (IO.staticFive==5)
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = new StringBuilder("Reinitialize");
                IO.writeLine(data.toString());
            }
        }
};