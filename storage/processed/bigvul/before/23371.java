class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data = (new CWE190_Integer_Overflow__int_Property_multiply_61b()).goodB2GSource();
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* FIX: Add a check to prevent an overflow from occurring */
                if (data < (Integer.MAX_VALUE/2))
                {
                    int result = (int)(data * 2);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too large to perform multiplication.");
                }
            }
    
        }
};