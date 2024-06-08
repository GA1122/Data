class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            byte data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Byte.MAX_VALUE;
            }
            else
            {
    
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Byte.MAX_VALUE;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* FIX: Add a check to prevent an overflow from occurring */
                    if (data < (Byte.MAX_VALUE/2))
                    {
                        byte result = (byte)(data * 2);
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
                    if (data < (Byte.MAX_VALUE/2))
                    {
                        byte result = (byte)(data * 2);
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