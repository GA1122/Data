class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            short data = (new CWE191_Integer_Underflow__short_console_readLine_postdec_61b()).goodG2BSource();
    
            /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
            data--;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};