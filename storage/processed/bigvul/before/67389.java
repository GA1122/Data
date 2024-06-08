class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            StringBuilder data;
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                /* POTENTIAL FLAW: Initialize, but do not use data */
                data = new StringBuilder("Good");
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                /* FIX: Use data without over-writing its value */
                IO.writeLine(data.toString());
            }
        }
};