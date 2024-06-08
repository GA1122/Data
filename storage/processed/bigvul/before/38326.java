class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data = (new CWE191_Integer_Underflow__int_random_sub_61b()).goodB2GSource();
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data > Integer.MIN_VALUE)
            {
                int result = (int)(data - 1);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to perform subtraction.");
            }
    
        }
};