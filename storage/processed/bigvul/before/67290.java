class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data;
    
            /* FIX: Initialize and use data before it is overwritten */
    
            data = 5;
    
            IO.writeLine("" + data);
    
            for (int j = 0; j < 1; j++)
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = 10;
                IO.writeLine("" + data);
            }
        }
};