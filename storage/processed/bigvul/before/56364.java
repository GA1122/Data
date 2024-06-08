class goodB2G2Sink_class{
    private void goodB2G2Sink(int data ) throws Throwable
        {
            if (goodB2G2Private)
            {
                /* FIX: test for a zero denominator */
                if (data != 0)
                {
                    IO.writeLine("100/" + data + " = " + (100 / data) + "\n");
                }
                else
                {
                    IO.writeLine("This would result in a divide by zero");
                }
            }
        }
};