class goodB2G2Sink_class{
    public void goodB2G2Sink(int count ) throws Throwable
        {
            if (CWE400_Resource_Exhaustion__listen_tcp_for_loop_22a.goodB2G2PublicStatic)
            {
                int i = 0;
                /* FIX: Validate count before using it as the for loop variant */
                if (count > 0 && count <= 20)
                {
                    for (i = 0; i < count; i++)
                    {
                        IO.writeLine("Hello");
                    }
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure count is inititialized before the Sink to avoid compiler errors */
                count = 0;
            }
        }
};