class goodB2G2Sink_class{
    public void goodB2G2Sink(String data ) throws Throwable
        {
            if (CWE606_Unchecked_Loop_Condition__connect_tcp_22a.goodB2G2PublicStatic)
            {
                int numberOfLoops;
                try
                {
                    numberOfLoops = Integer.parseInt(data);
                }
                catch (NumberFormatException exceptNumberFormat)
                {
                    IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                    numberOfLoops = 1;
                }
                /* FIX: loop number thresholds validated */
                if (numberOfLoops >= 0 && numberOfLoops <= 5)
                {
                    for (int i=0; i < numberOfLoops; i++)
                    {
                        IO.writeLine("hello world");
                    }
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
        }
};