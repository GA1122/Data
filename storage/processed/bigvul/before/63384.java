class bad_class{
    public void bad() throws Throwable
        {
            int count;
            if (5==5)
            {
                /* POTENTIAL FLAW: Set count to a random value */
                count = (new SecureRandom()).nextInt();
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure count is inititialized before the Sink to avoid compiler errors */
                count = 0;
            }
    
            if (5==5)
            {
                /* POTENTIAL FLAW: Use count as the input to Thread.sleep() */
                Thread.sleep(count);
            }
        }
};