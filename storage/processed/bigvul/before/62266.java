class goodG2BSink_class{
    public void goodG2BSink(int count ) throws Throwable
        {
            if (CWE400_Resource_Exhaustion__sleep_console_readLine_22a.goodG2BPublicStatic)
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