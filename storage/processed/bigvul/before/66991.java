class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = "Good";
    
            if (PRIVATE_STATIC_FINAL_FIVE == 5)
            {
                /* FLAW: Do not use the variable */
                /* do nothing */
                ; /* empty statement needed for some flow variants */
            }
        }
};