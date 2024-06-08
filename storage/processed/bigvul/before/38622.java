class goodB2G2Sink_class{
    private void goodB2G2Sink(int data ) throws Throwable
        {
            if (goodB2G2Private)
            {
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data > Integer.MIN_VALUE)
                {
                    data--;
                    int result = (int)(data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to decrement.");
                }
            }
        }
};