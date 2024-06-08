class goodB2G2Sink_class{
    public void goodB2G2Sink(short data ) throws Throwable
        {
            if (CWE190_Integer_Overflow__short_console_readLine_square_22a.goodB2G2PublicStatic)
            {
                /* FIX: Add a check to prevent an overflow from occurring */
                /* NOTE: Math.abs of the minimum int or long will return that same value, so we must check for it */
                if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long)Math.sqrt(Short.MAX_VALUE)))
                {
                    short result = (short)(data * data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too large to perform squaring.");
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
        }
};