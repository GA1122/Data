class goodB2G1Sink_class{
    public void goodB2G1Sink(int data ) throws Throwable
        {
            if (CWE190_Integer_Overflow__int_console_readLine_add_22a.goodB2G1PublicStatic)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
            else
            {
    
                /* FIX: Add a check to prevent an overflow from occurring */
                if (data < Integer.MAX_VALUE)
                {
                    int result = (int)(data + 1);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too large to perform addition.");
                }
    
            }
        }
};