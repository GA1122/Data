class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            long data = CWE190_Integer_Overflow__long_max_preinc_68a.data;
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Long.MAX_VALUE)
            {
                long result = (long)(++data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too large to increment.");
            }
    
        }
};