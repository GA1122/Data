class goodB2GSink_class{
    private void goodB2GSink() throws Throwable
        {
            byte data = dataGoodB2G;
    
            /* FIX: Add a check to prevent an overflow from occurring */
            /* NOTE: Math.abs of the minimum int or long will return that same value, so we must check for it */
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long)Math.sqrt(Byte.MAX_VALUE)))
            {
                byte result = (byte)(data * data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too large to perform squaring.");
            }
    
        }
};