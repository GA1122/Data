class badSink_class{
    public void badSink() throws Throwable
        {
            byte data = CWE191_Integer_Underflow__byte_min_postdec_68a.data;
    
            /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
            data--;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};