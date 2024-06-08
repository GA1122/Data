class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            int data;
            if (5!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
            else
            {
    
                /* FIX: Initialize and use data before it is overwritten */
    
                data = 5;
    
                IO.writeLine("" + data);
    
            }
    
            if (5==5)
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = 10;
                IO.writeLine("" + data);
            }
        }
};