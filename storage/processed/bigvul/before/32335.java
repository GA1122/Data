class goodB2G2Sink_class{
    public void goodB2G2Sink(int data ) throws Throwable
        {
            if (CWE191_Integer_Underflow__int_connect_tcp_predec_22a.goodB2G2PublicStatic)
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
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
        }
};