class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            String data;
            if (privateFalse)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
            else
            {
    
                /* FIX: Initialize and use data before it is overwritten */
    
                data = "Good";
    
                IO.writeLine(data);
    
            }
    
            if (privateTrue)
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = "Reinitialize";
                IO.writeLine(data);
            }
        }
};