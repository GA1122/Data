class bad_class{
    public void bad() throws Throwable
        {
            short data;
            if (5 == 5)
            {
                /* FLAW: Use a number larger than Byte.MAX_VALUE */
                data = Byte.MAX_VALUE + 5;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};