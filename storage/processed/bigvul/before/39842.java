class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MIN_VALUE;
    
            /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
            data--;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};