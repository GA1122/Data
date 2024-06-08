class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            byte data = CWE190_Integer_Overflow__byte_console_readLine_multiply_68a.data;
    
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
};