class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data = (new CWE191_Integer_Underflow__int_random_predec_61b()).goodB2GSource();
    
            /* FIX: Add a check to prevent an underflow from occurring */
            if (data > Integer.MIN_VALUE)
            {
                int result = (int)(--data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to decrement.");
            }
    
        }
};