class goodB2G2Sink_class{
    public void goodB2G2Sink(byte data ) throws Throwable
        {
            if (CWE191_Integer_Underflow__byte_console_readLine_multiply_22a.goodB2G2PublicStatic)
            {
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* FIX: Add a check to prevent an underflow from occurring */
                    if (data > (Byte.MIN_VALUE/2))
                    {
                        byte result = (byte)(data * 2);
                        IO.writeLine("result: " + result);
                    }
                    else
                    {
                        IO.writeLine("data value is too small to perform multiplication.");
                    }
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