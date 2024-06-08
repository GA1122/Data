class bad_class{
    public void bad() throws Throwable
        {
            long dataCopy;
            {
                long data;
    
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Long.MAX_VALUE;
    
                dataCopy = data;
            }
            {
                long data = dataCopy;
    
                /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
                long result = (long)(++data);
    
                IO.writeLine("result: " + result);
    
            }
        }
};