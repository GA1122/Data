class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Don't initialize or use data */
            ; /* empty statement needed for some flow variants */
    
            if (IO.STATIC_FINAL_TRUE)
            {
                /* FIX: Initialize then use data */
                data = 5L;
                IO.writeLine("" + data);
            }
        }
};