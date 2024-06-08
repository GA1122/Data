class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            float data;
            if (IO.staticTrue)
            {
                /* FIX: Use a hardcoded number that won't a divide by zero */
                data = 2.0f;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0.0f;
            }
    
            if (IO.staticTrue)
            {
                /* POTENTIAL FLAW: Possibly divide by zero */
                int result = (int)(100.0 / data);
                IO.writeLine(result);
            }
        }
};