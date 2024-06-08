class goodB2G2Sink_class{
    public void goodB2G2Sink(int count ) throws Throwable
        {
            if (CWE400_Resource_Exhaustion__sleep_File_22a.goodB2G2PublicStatic)
            {
                /* FIX: Validate count before using it in a call to Thread.sleep() */
                if (count > 0 && count <= 2000)
                {
                    Thread.sleep(count);
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