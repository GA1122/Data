class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            byte data = CWE191_Integer_Underflow__byte_min_multiply_68a.data;
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data > (Byte.MIN_VALUE/2))
                {
                    byte result = (byte)(data * 2);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to perform multiplication.");
                }
            }
    
        }
};