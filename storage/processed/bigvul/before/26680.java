class badSink_class{
    public void badSink(long dataArray[] ) throws Throwable
        {
            long data = dataArray[2];
    
            /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
            data++;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};