class goodG2BSink_class{
    public void goodG2BSink(Object dataObject ) throws Throwable
        {
            long data = (Long)dataObject;
    
            /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
            data--;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};