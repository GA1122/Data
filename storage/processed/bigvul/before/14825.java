class badSink_class{
    private void badSink() throws Throwable
        {
            byte data = dataBad;
    
            /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
            data++;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};