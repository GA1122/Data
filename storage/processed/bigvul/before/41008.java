class bad_class{
    public void bad() throws Throwable
        {
            short data = (new CWE191_Integer_Underflow__short_console_readLine_multiply_61b()).badSource();
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Short.MIN_VALUE, this will underflow */
                short result = (short)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};