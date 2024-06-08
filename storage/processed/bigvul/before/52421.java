class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            float data;
            if (5!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0.0f;
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't a divide by zero */
                data = 2.0f;
    
            }
    
            if (5==5)
            {
                /* POTENTIAL FLAW: Possibly divide by zero */
                int result = (int)(100.0 / data);
                IO.writeLine(result);
            }
        }
};