class goodB2GSink_class{
    public void goodB2GSink(byte dataArray[] ) throws Throwable
        {
            byte data = dataArray[2];
    
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