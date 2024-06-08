class goodB2G1Sink_class{
    public void goodB2G1Sink(byte data ) throws Throwable
        {
            if (CWE191_Integer_Underflow__byte_rand_predec_22a.goodB2G1PublicStatic)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
            else
            {
    
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data > Byte.MIN_VALUE)
                {
                    byte result = (byte)(--data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to decrement.");
                }
    
            }
        }
};