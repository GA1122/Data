class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Don't initialize or use data */
            ; /* empty statement needed for some flow variants */
    
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Initialize then use data */
                data = 5L;
                IO.writeLine("" + data);
            }
            else
            {
    
                /* FIX: Initialize then use data */
    
                data = 5L;
    
                IO.writeLine("" + data);
    
            }
        }
};