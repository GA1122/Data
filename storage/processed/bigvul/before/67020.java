class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = "Good";
    
            while (true)
            {
                /* FLAW: Do not use the variable */
                /* do nothing */
                ; /* empty statement needed for some flow variants */
                break;
            }
    
        }
};