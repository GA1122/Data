class badSink_class{
    public void badSink(long dataArray[] ) throws Throwable
        {
            long data = dataArray[2];
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Long.MIN_VALUE, this will underflow */
                long result = (long)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};