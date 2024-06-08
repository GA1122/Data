class goodB2G1Sink_class{
    private void goodB2G1Sink(byte data ) throws Throwable
        {
            if (goodB2G1Private)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data > Byte.MIN_VALUE)
                {
                    data--;
                    byte result = (byte)(data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to decrement.");
                }
    
            }
        }
};