class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            short data = CWE190_Integer_Overflow__short_rand_preinc_68a.data;
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Short.MAX_VALUE)
            {
                short result = (short)(++data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too large to increment.");
            }
    
        }
};