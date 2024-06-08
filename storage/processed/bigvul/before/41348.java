class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            short data = (new CWE191_Integer_Underflow__short_console_readLine_predec_61b()).goodB2GSource();
    
            /* FIX: Add a check to prevent an underflow from occurring */
            if (data > Short.MIN_VALUE)
            {
                short result = (short)(--data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to decrement.");
            }
    
        }
};