class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            byte data = CWE191_Integer_Underflow__byte_rand_predec_68a.data;
    
            /* FIX: Add a check to prevent an underflow from occurring */
            if (data > Byte.MIN_VALUE)
            {
                byte result = (byte)(--data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to decrement.");
            }
    
        }
};