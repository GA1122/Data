class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = new StringBuilder("Good");
    
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FLAW: Do not use the variable */
                /* do nothing */
                ; /* empty statement needed for some flow variants */
            }
            else
            {
    
                /* FIX: Use data */
    
                IO.writeLine(data.toString());
    
            }
        }
};