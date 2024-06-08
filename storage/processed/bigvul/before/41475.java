class goodB2G2Sink_class{
    public void goodB2G2Sink(short data ) throws Throwable
        {
            if (CWE191_Integer_Underflow__short_console_readLine_sub_22a.goodB2G2PublicStatic)
            {
                /* FIX: Add a check to prevent an overflow from occurring */
                if (data > Short.MIN_VALUE)
                {
                    short result = (short)(data - 1);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to perform subtraction.");
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