class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            long data;
            if (privateTrue)
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
    
            if (privateTrue)
            {
                /* FIX: Add a check to prevent an overflow from occurring */
                if (data < Long.MAX_VALUE)
                {
                    data++;
                    long result = (long)(data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too large to increment.");
                }
            }
        }
};