class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            long data = CWE191_Integer_Underflow__long_rand_predec_68a.data;
    
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