class badSink_class{
    private void badSink() throws Throwable
        {
            short data = dataBad;
    
            /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
            data++;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};