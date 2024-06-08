class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            String data;
            if (IO.STATIC_FINAL_TRUE)
            {
                /* get environment variable ADD */
                /* POTENTIAL FLAW: Read data from an environment variable */
                data = System.getenv("ADD");
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (IO.STATIC_FINAL_TRUE)
            {
                if (data != null)
                {
                    /* FIX: explicitly defined string formatting */
                    System.out.printf("%s%n", data);
                }
            }
        }
};