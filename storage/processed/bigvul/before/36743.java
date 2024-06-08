class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data = (new CWE191_Integer_Underflow__int_PropertiesFile_postdec_61b()).goodB2GSource();
    
            /* FIX: Add a check to prevent an underflow from occurring */
            if (data > Integer.MIN_VALUE)
            {
                data--;
                int result = (int)(data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to decrement.");
            }
    
        }
};