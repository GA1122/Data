class bad_class{
    public void bad() throws Throwable
        {
            short data;
            if (IO.STATIC_FINAL_TRUE)
            {
                /* POTENTIAL FLAW: Use a random value */
                data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (IO.STATIC_FINAL_TRUE)
            {
                /* POTENTIAL FLAW: if (data*data) > Short.MAX_VALUE, this will overflow */
                short result = (short)(data * data);
                IO.writeLine("result: " + result);
            }
        }
};