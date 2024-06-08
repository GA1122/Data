class goodB2GSink_class{
    public void goodB2GSink(CWE190_Integer_Overflow__short_rand_add_67a.Container dataContainer ) throws Throwable
        {
            short data = dataContainer.containerOne;
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Short.MAX_VALUE)
            {
                short result = (short)(data + 1);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too large to perform addition.");
            }
    
        }
};