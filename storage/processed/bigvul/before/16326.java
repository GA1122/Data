class goodB2G2Sink_class{
    private void goodB2G2Sink(byte data ) throws Throwable
        {
            if (goodB2G2Private)
            {
                /* FIX: Add a check to prevent an overflow from occurring */
                if (data < Byte.MAX_VALUE)
                {
                    data++;
                    byte result = (byte)(data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too large to increment.");
                }
            }
        }
};