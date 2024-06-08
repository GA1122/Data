class bad_class{
    public void bad() throws Throwable
        {
            short data;
            if (PRIVATE_STATIC_FINAL_FIVE==5)
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Short.MAX_VALUE;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (PRIVATE_STATIC_FINAL_FIVE==5)
            {
                /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
                short result = (short)(++data);
                IO.writeLine("result: " + result);
            }
        }
};