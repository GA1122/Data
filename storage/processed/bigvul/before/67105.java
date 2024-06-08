class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Don't initialize or use data */
            ; /* empty statement needed for some flow variants */
    
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FLAW: Don't initialize or use data */
                /* do nothing */
                ; /* empty statement needed for some flow variants */
            }
            else
            {
    
                /* FIX: Initialize then use data */
    
                data = 5L;
    
                IO.writeLine("" + data);
    
            }
        }
};