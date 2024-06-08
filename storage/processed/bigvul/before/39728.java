class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Long.MIN_VALUE;
            }
            else
            {
    
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Long.MIN_VALUE;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* FIX: Add a check to prevent an underflow from occurring */
                    if (data > (Long.MIN_VALUE/2))
                    {
                        long result = (long)(data * 2);
                        IO.writeLine("result: " + result);
                    }
                    else
                    {
                        IO.writeLine("data value is too small to perform multiplication.");
                    }
                }
            }
            else
            {
    
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* FIX: Add a check to prevent an underflow from occurring */
                    if (data > (Long.MIN_VALUE/2))
                    {
                        long result = (long)(data * 2);
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