class bad_class{
    public void bad() throws Throwable
        {
            float data;
            if (true)
            {
                data = 0.0f; /* POTENTIAL FLAW: data is set to zero */
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0.0f;
            }
    
            if (true)
            {
                /* POTENTIAL FLAW: Possibly modulo by zero */
                int result = (int)(100.0 % data);
                IO.writeLine(result);
            }
        }
};