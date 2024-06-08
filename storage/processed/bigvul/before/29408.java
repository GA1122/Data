class goodB2GSink_class{
    public void goodB2GSink(Vector<Short> dataVector ) throws Throwable
        {
            short data = dataVector.remove(2);
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Short.MAX_VALUE)
            {
                short result = (short)(data + 1);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too large to perform addition.");
            }
    
        }
};