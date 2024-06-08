class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Long.MIN_VALUE;
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
                long result = (long)(data - 1);
                IO.writeLine("result: " + result);
                break;
            }
        }
};