class goodG2BSink_class{
    public void goodG2BSink(CWE190_Integer_Overflow__byte_console_readLine_postinc_67a.Container dataContainer ) throws Throwable
        {
            byte data = dataContainer.containerOne;
    
            /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
            data++;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};