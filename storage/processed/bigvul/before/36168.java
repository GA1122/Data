class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int data;
            if (true)
            {
                /* POTENTIAL FLAW: Use the maximum value for this type */
                data = Integer.MIN_VALUE;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (false)
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