class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Use a random value */
                data = (new java.security.SecureRandom()).nextLong();
            }
            else
            {
    
                /* POTENTIAL FLAW: Use a random value */
                data = (new java.security.SecureRandom()).nextLong();
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
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