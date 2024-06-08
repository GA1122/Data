class goodB2G2Sink_class{
    public void goodB2G2Sink(long data ) throws Throwable
        {
            if (CWE191_Integer_Underflow__long_min_predec_22a.goodB2G2PublicStatic)
            {
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data > Long.MIN_VALUE)
                {
                    long result = (long)(--data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to decrement.");
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0L;
            }
        }
};