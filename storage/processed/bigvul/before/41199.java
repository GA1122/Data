class goodG2BSink_class{
    public void goodG2BSink() throws Throwable
        {
            short data = CWE191_Integer_Underflow__short_console_readLine_postdec_68a.data;
    
            /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
            data--;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};