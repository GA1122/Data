class bad_class{
    public void bad() throws Throwable
        {
            long data;
            if (PRIVATE_STATIC_FINAL_FIVE==5)
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
    
            if (PRIVATE_STATIC_FINAL_FIVE==5)
            {
                /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
                long result = (long)(--data);
                IO.writeLine("result: " + result);
            }
        }
};