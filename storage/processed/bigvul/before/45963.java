class bad_class{
    public void bad() throws Throwable
        {
            short data;
            if (privateFive == 5)
            {
                /* FLAW: Set data to a random value */
                data = (short)((new SecureRandom()).nextInt(Short.MAX_VALUE + 1));
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