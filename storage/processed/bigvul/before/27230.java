class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long dataCopy;
            {
                long data;
    
                /* POTENTIAL FLAW: Use a random value */
                data = (new java.security.SecureRandom()).nextLong();
    
                dataCopy = data;
            }
            {
                long data = dataCopy;
    
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