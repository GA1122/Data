class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            String data;
            if (IO.staticTrue)
            {
                /* get system property user.home */
                /* POTENTIAL FLAW: Read data from a system property */
                data = System.getProperty("user.home");
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (IO.staticTrue)
            {
                if (data != null)
                {
                    /* FIX: explicitly defined string formatting */
                    System.out.format("%s%n", data);
                }
            }
        }
};