class goodB2G2Sink_class{
    public void goodB2G2Sink(int data ) throws Throwable
        {
            if (CWE369_Divide_by_Zero__int_connect_tcp_divide_22a.goodB2G2PublicStatic)
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
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
        }
};