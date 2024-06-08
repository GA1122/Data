class goodG2BSink_class{
    public void goodG2BSink(long data ) throws Throwable
        {
            if (CWE190_Integer_Overflow__long_rand_postinc_22a.goodG2BPublicStatic)
            {
                /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
                data++;
                long result = (long)(data);
                IO.writeLine("result: " + result);
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0L;
            }
        }
};