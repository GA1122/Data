class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
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
    
                data = "Good";
    
                IO.writeLine(data);
    
            }
        }
};