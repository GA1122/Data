class goodB2G2Sink_class{
    private void goodB2G2Sink(short data ) throws Throwable
        {
            if (goodB2G2Private)
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