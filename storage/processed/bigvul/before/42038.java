class bad_class{
    public void bad() throws Throwable
        {
            short data;
            if (IO.STATIC_FINAL_TRUE)
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Short.MIN_VALUE;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (IO.STATIC_FINAL_TRUE)
            {
                /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
                short result = (short)(data - 1);
                IO.writeLine("result: " + result);
            }
        }
};