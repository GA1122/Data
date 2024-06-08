class badSink_class{
    public void badSink(short dataArray[] ) throws Throwable
        {
            short data = dataArray[2];
    
            /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
            data++;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};