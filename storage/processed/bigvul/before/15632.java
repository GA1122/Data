class badSink_class{
    public void badSink(Object dataObject ) throws Throwable
        {
            byte data = (Byte)dataObject;
    
            /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
            data++;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};