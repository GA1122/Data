class goodB2GSink_class{
    public void goodB2GSink(Object dataObject ) throws Throwable
        {
            byte data = (Byte)dataObject;
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data > Byte.MIN_VALUE)
            {
                byte result = (byte)(data - 1);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to perform subtraction.");
            }
    
        }
};