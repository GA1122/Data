class badSink_class{
    public void badSink(Object dataObject ) throws Throwable
        {
            short data = (Short)dataObject;
    
            /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
            data--;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};