class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = 5;
    
            for (int k = 0; k < 1; k++)
            {
                /* FIX: Use data */
                IO.writeLine("" + data);
            }
        }
};