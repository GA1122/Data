class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            int data = CWE191_Integer_Underflow__int_URLConnection_postdec_68a.data;
    
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