class goodG2BSink_class{
    public void goodG2BSink(long data ) throws Throwable
        {
            if (CWE190_Integer_Overflow__long_max_multiply_22a.goodG2BPublicStatic)
            {
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* POTENTIAL FLAW: if (data*2) > Long.MAX_VALUE, this will overflow */
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