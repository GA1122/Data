class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            byte data = goodB2GSource();
    
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