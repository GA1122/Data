class bad_class{
    public void bad() throws Throwable
        {
            long data;
            if (true)
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Long.MIN_VALUE;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0L;
            }
    
            if (true)
            {
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* POTENTIAL FLAW: if (data * 2) < Long.MIN_VALUE, this will underflow */
                    long result = (long)(data * 2);
                    IO.writeLine("result: " + result);
                }
            }
        }
};