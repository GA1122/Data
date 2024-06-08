class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data = (new CWE191_Integer_Underflow__int_Property_multiply_61b()).goodB2GSource();
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data > (Integer.MIN_VALUE/2))
                {
                    int result = (int)(data * 2);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to perform multiplication.");
                }
            }
    
        }
};