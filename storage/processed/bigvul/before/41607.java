class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Short.MIN_VALUE;
                break;
            }
    
            while (true)
            {
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* POTENTIAL FLAW: if (data * 2) < Short.MIN_VALUE, this will underflow */
                    short result = (short)(data * 2);
                    IO.writeLine("result: " + result);
                }
                break;
            }
        }
};