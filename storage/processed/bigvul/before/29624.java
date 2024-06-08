class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            short data;
            if (privateFive==5)
            {
                /* POTENTIAL FLAW: Use a random value */
                data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (privateFive==5)
            {
                /* FIX: Add a check to prevent an overflow from occurring */
                if (data < Short.MAX_VALUE)
                {
                    data++;
                    short result = (short)(data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too large to increment.");
                }
            }
        }
};