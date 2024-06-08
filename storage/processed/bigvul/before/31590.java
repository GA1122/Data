class badSink_class{
    public void badSink(Vector<Byte> dataVector ) throws Throwable
        {
            byte data = dataVector.remove(2);
    
            /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
            data--;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};