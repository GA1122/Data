class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = 5;
    
            if (privateReturnsTrue())
            {
                /* FIX: Use data */
                IO.writeLine("" + data);
            }
        }
};