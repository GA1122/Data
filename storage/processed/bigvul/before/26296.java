class bad_class{
    public void bad() throws Throwable
        {
            long data;
            if (IO.STATIC_FINAL_TRUE)
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Long.MAX_VALUE;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0L;
            }
    
            if (IO.STATIC_FINAL_TRUE)
            {
                /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
                long result = (long)(data + 1);
                IO.writeLine("result: " + result);
            }
        }
};