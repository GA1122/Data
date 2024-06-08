class goodB2G2_class{
    private void goodB2G2() throws Throwable
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
                /* FIX: Use data without over-writing its value */
                IO.writeLine(data);
            }
        }
};