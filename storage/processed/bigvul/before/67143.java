class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: Don't initialize or use data */
            ; /* empty statement needed for some flow variants */
    
            if (IO.STATIC_FINAL_TRUE)
            {
                /* FLAW: Don't initialize or use data */
                /* do nothing */
                ; /* empty statement needed for some flow variants */
            }
        }
};