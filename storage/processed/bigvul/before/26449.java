class bad_class{
    public void bad() throws Throwable
        {
            long data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Long.MAX_VALUE;
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* POTENTIAL FLAW: if (data*2) > Long.MAX_VALUE, this will overflow */
                    long result = (long)(data * 2);
                    IO.writeLine("result: " + result);
                }
            }
            else
            {
    
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* FIX: Add a check to prevent an overflow from occurring */
                    if (data < (Long.MAX_VALUE/2))
                    {
                        long result = (long)(data * 2);
                        IO.writeLine("result: " + result);
                    }
                    else
                    {
                        IO.writeLine("data value is too large to perform multiplication.");
                    }
                }
    
            }
        }
};