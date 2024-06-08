class goodB2G2Sink_class{
    private void goodB2G2Sink(short data ) throws Throwable
        {
            if (goodB2G2Private)
            {
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data > Short.MIN_VALUE)
                {
                    data--;
                    short result = (short)(data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to decrement.");
                }
            }
        }
};