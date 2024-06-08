class badSink_class{
    public void badSink(byte dataArray[] ) throws Throwable
        {
            byte data = dataArray[2];
    
            /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
            data--;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};