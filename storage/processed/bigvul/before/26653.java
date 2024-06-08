class badSink_class{
    public void badSink(long data ) throws Throwable
        {
            if (CWE190_Integer_Overflow__long_max_postinc_22a.badPublicStatic)
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