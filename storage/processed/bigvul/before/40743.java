class bad_class{
    public void bad() throws Throwable
        {
            long data;
            if (true)
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
    
            if (true)
            {
                /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
                long result = (long)(data - 1);
                IO.writeLine("result: " + result);
            }
        }
};