class badSink_class{
    public void badSink(CWE190_Integer_Overflow__byte_rand_postinc_67a.Container dataContainer ) throws Throwable
        {
            byte data = dataContainer.containerOne;
    
            /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
            data++;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};