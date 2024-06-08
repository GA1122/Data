class goodB2G1Sink_class{
    private void goodB2G1Sink(int data ) throws Throwable
        {
            if (goodB2G1Private)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data > Integer.MIN_VALUE)
                {
                    int result = (int)(--data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to decrement.");
                }
    
            }
        }
};