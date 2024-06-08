class goodG2BSink_class{
    public void goodG2BSink(short data ) throws Throwable
        {
            if (CWE191_Integer_Underflow__short_min_postdec_22a.goodG2BPublicStatic)
            {
                /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
                data--;
                short result = (short)(data);
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