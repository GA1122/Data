class bad_class{
    public void bad() throws Throwable
        {
            int data;
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                /* FLAW: Use a number larger than Short.MAX_VALUE */
                data = Short.MAX_VALUE + 5;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            {
                /* POTENTIAL FLAW: Convert data to a short, possibly causing a truncation error */
                IO.writeLine((short)data);
            }
    
        }
};