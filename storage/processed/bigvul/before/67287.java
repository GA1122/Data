class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data;
    
            while (true)
            {
                /* FIX: Initialize and use data before it is overwritten */
                data = 5;
                IO.writeLine("" + data);
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = 10;
                IO.writeLine("" + data);
                break;
            }
    
        }
};