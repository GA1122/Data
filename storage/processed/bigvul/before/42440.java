class badSink_class{
    public void badSink(Vector<Short> dataVector ) throws Throwable
        {
            short data = dataVector.remove(2);
    
            /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
            data--;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};