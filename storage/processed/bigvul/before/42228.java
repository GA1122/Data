class goodB2G1Sink_class{
    public void goodB2G1Sink(short data ) throws Throwable
        {
            if (CWE191_Integer_Underflow__short_rand_multiply_22a.goodB2G1PublicStatic)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
            else
            {
    
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* FIX: Add a check to prevent an underflow from occurring */
                    if (data > (Short.MIN_VALUE/2))
                    {
                        short result = (short)(data * 2);
                        IO.writeLine("result: " + result);
                    }
                    else
                    {
                        IO.writeLine("data value is too small to perform multiplication.");
                    }
                }
    
            }
        }
};