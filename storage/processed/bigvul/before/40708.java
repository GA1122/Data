class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long data = (new CWE191_Integer_Underflow__long_rand_predec_61b()).goodB2GSource();
    
            /* FIX: Add a check to prevent an underflow from occurring */
            if (data > Long.MIN_VALUE)
            {
                long result = (long)(--data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to decrement.");
            }
    
        }
};