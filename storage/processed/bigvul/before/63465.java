class badSink_class{
    public void badSink(int count ) throws Throwable
        {
            if (CWE400_Resource_Exhaustion__sleep_random_22a.badPublicStatic)
            {
                /* POTENTIAL FLAW: Use count as the input to Thread.sleep() */
                Thread.sleep(count);
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure count is inititialized before the Sink to avoid compiler errors */
                count = 0;
            }
        }
};