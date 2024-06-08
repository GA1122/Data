class goodB2GSink_class{
    public void goodB2GSink(short data ) throws Throwable
        {
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Short.MAX_VALUE)
            {
                data++;
                short result = (short)(data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too large to increment.");
            }
    
        }
};