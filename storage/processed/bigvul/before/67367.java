class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            long data;
    
            while (true)
            {
                /* FIX: Initialize and use data before it is overwritten */
                data = 5L;
                IO.writeLine("" + data);
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = 10L;
                IO.writeLine("" + data);
                break;
            }
    
        }
};