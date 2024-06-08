class bad_class{
    public void bad() throws Throwable
        {
            short data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Short.MIN_VALUE;
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* POTENTIAL FLAW: if (data * 2) < Short.MIN_VALUE, this will underflow */
                    short result = (short)(data * 2);
                    IO.writeLine("result: " + result);
                }
            }
            else
            {
    
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* FIX: Add a check to prevent an underflow from occurring */
                    if (data > (Short.MIN_VALUE/2))
                    {
                        short result = (short)(data * 2);
                        IO.writeLine("result: " + result);
                    }
                    else
                    {
                        IO.writeLine("data value is too small to perform multiplication.");
                    }
                }
    
            }
        }
};