class goodG2BSink_class{
    public void goodG2BSink(long dataArray[] ) throws Throwable
        {
            long data = dataArray[2];
    
            /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
            data++;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};