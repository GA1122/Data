class bad_class{
    public void bad() throws Throwable
        {
            short data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Use a random value */
                data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);
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
                    /* POTENTIAL FLAW: if (data*2) > Short.MAX_VALUE, this will overflow */
                    short result = (short)(data * 2);
                    IO.writeLine("result: " + result);
                }
            }
            else
            {
    
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* FIX: Add a check to prevent an overflow from occurring */
                    if (data < (Short.MAX_VALUE/2))
                    {
                        short result = (short)(data * 2);
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