class goodG2BSink_class{
    public void goodG2BSink(CWE191_Integer_Underflow__byte_console_readLine_postdec_67a.Container dataContainer ) throws Throwable
        {
            byte data = dataContainer.containerOne;
    
            /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
            data--;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};