class goodB2GSink_class{
    public void goodB2GSink(Vector<Short> dataVector ) throws Throwable
        {
            short data = dataVector.remove(2);
    
            /* FIX: Add a check to prevent an underflow from occurring */
            if (data > Short.MIN_VALUE)
            {
                data--;
                short result = (short)(data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to decrement.");
            }
    
        }
};