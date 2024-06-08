class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Long.MAX_VALUE;
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
                long result = (long)(++data);
                IO.writeLine("result: " + result);
                break;
            }
        }
};