class goodB2G1Sink_class{
    public void goodB2G1Sink(int count ) throws Throwable
        {
            if (CWE400_Resource_Exhaustion__sleep_Environment_22a.goodB2G1PublicStatic)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure count is inititialized before the Sink to avoid compiler errors */
                count = 0;
            }
            else
            {
    
                /* FIX: Validate count before using it in a call to Thread.sleep() */
                if (count > 0 && count <= 2000)
                {
                    Thread.sleep(count);
                }
    
            }
        }
};