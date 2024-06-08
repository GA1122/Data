class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long data = (new CWE190_Integer_Overflow__long_rand_multiply_61b()).goodB2GSource();
    
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