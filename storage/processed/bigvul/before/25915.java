class goodB2GSink_class{
    public void goodB2GSink(CWE190_Integer_Overflow__long_console_readLine_postinc_67a.Container dataContainer ) throws Throwable
        {
            long data = dataContainer.containerOne;
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Long.MAX_VALUE)
            {
                data++;
                long result = (long)(data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too large to increment.");
            }
    
        }
};