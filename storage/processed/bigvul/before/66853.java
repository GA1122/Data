class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = 5;
    
            if (IO.STATIC_FINAL_TRUE)
            {
                /* FLAW: Do not use the variable */
                /* do nothing */
                ; /* empty statement needed for some flow variants */
            }
        }
};