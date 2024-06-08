class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            long data;
            if (true)
            {
                /* POTENTIAL FLAW: Initialize, but do not use data */
                data = 5L;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0L;
            }
    
            if (true)
            {
                /* FIX: Use data without over-writing its value */
                IO.writeLine("" + data);
            }
        }
};