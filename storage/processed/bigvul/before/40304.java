class bad_class{
    public void bad() throws Throwable
        {
            long data;
            if (privateFive==5)
            {
                /* POTENTIAL FLAW: Use a random value */
                data = (new java.security.SecureRandom()).nextLong();
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0L;
            }
    
            if (privateFive==5)
            {
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* POTENTIAL FLAW: if (data * 2) < Long.MIN_VALUE, this will underflow */
                    long result = (long)(data * 2);
                    IO.writeLine("result: " + result);
                }
            }
        }
};