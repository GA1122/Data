class goodB2GSink_class{
    private void goodB2GSink() throws Throwable
        {
            byte data = dataGoodB2G;
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Byte.MAX_VALUE)
            {
                data++;
                byte result = (byte)(data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too large to increment.");
            }
    
        }
};