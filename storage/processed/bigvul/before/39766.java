class goodG2BSink_class{
    public void goodG2BSink(long data ) throws Throwable
        {
            if (CWE191_Integer_Underflow__long_min_multiply_22a.goodG2BPublicStatic)
            {
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* POTENTIAL FLAW: if (data * 2) < Long.MIN_VALUE, this will underflow */
                    long result = (long)(data * 2);
                    IO.writeLine("result: " + result);
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0L;
            }
        }
};