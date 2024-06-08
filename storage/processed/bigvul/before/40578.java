class badSink_class{
    public void badSink(Vector<Long> dataVector ) throws Throwable
        {
            long data = dataVector.remove(2);
    
            /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
            data--;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};