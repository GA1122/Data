class bad_class{
    public void bad() throws Throwable
        {
            long data;
            if (privateFive==5)
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
    
            if (privateFive==5)
            {
                /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
                long result = (long)(data + 1);
                IO.writeLine("result: " + result);
            }
        }
};