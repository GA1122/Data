class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            byte data;
            if (5==5)
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Byte.MIN_VALUE;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (5==5)
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