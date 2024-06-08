class goodB2GSink_class{
    public void goodB2GSink(CWE190_Integer_Overflow__long_console_readLine_multiply_67a.Container dataContainer ) throws Throwable
        {
            long data = dataContainer.containerOne;
    
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
};