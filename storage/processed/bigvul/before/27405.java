class badSink_class{
    private void badSink() throws Throwable
        {
            long data = dataBad;
    
            /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
            data++;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};