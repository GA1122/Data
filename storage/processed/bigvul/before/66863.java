class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = 5;
    
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Use data */
                IO.writeLine("" + data);
            }
            else
            {
    
                /* FIX: Use data */
    
                IO.writeLine("" + data);
    
            }
        }
};