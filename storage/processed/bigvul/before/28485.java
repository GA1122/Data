class badSink_class{
    public void badSink(short data ) throws Throwable
        {
            if (CWE190_Integer_Overflow__short_console_readLine_square_22a.badPublicStatic)
            {
                /* POTENTIAL FLAW: if (data*data) > Short.MAX_VALUE, this will overflow */
                short result = (short)(data * data);
                IO.writeLine("result: " + result);
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
        }
};