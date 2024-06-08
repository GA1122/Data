class badSink_class{
    public void badSink(CWE191_Integer_Underflow__byte_min_postdec_67a.Container dataContainer ) throws Throwable
        {
            byte data = dataContainer.containerOne;
    
            /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
            data--;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};