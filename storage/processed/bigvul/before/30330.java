class bad_class{
    public void bad() throws Throwable
        {
            byte data = (new CWE191_Integer_Underflow__byte_console_readLine_postdec_61b()).badSource();
    
            /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
            data--;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};