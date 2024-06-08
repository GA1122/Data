class badSink_class{
    public void badSink(long data ) throws Throwable
        {
            if (CWE191_Integer_Underflow__long_min_predec_22a.badPublicStatic)
            {
                /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
                long result = (long)(--data);
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