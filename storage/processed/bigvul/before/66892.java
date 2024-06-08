class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = 5L;
    
            if (privateTrue)
            {
                /* FIX: Use data */
                IO.writeLine("" + data);
            }
        }
};