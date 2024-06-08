class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            long data;
    
            /* FIX: Initialize and use data before it is overwritten */
    
            data = 5L;
    
            IO.writeLine("" + data);
    
            for (int j = 0; j < 1; j++)
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = 10L;
                IO.writeLine("" + data);
            }
        }
};