class goodB2GSink_class{
    public void goodB2GSink(Vector<Byte> dataVector ) throws Throwable
        {
            byte data = dataVector.remove(2);
    
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