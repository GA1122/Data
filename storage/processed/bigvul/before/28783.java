class goodB2GSink_class{
    private void goodB2GSink(short data ) throws Throwable
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
};