class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = 5L;
    
            for (int k = 0; k < 1; k++)
            {
                /* FIX: Use data without over-writing its value */
                IO.writeLine("" + data);
            }
        }
};