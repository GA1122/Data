class goodB2GSink_class{
    public void goodB2GSink(Object dataObject ) throws Throwable
        {
            byte data = (Byte)dataObject;
    
            /* FIX: Add a check to prevent an underflow from occurring */
            if (data > Byte.MIN_VALUE)
            {
                data--;
                byte result = (byte)(data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to decrement.");
            }
    
        }
};