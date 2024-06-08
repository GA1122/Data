class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            String data;
            if (privateFive==5)
            {
                /* FIX: Use a hardcoded string */
                data = "foo";
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (privateFive==5)
            {
                if (data != null)
                {
                    /* POTENTIAL FLAW: uncontrolled string formatting */
                    System.out.format(data);
                }
            }
        }
};