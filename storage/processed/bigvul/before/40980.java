class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            short data = goodB2GSource();
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data > (Short.MIN_VALUE/2))
                {
                    short result = (short)(data * 2);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to perform multiplication.");
                }
            }
    
        }
};