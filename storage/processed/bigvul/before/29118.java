class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            short data = (new CWE190_Integer_Overflow__short_max_preinc_61b()).goodB2GSource();
    
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