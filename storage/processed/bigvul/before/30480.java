class goodB2GSink_class{
    private void goodB2GSink(byte data ) throws Throwable
        {
    
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