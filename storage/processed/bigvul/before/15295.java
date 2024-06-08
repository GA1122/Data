class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            byte data = goodB2GSource();
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Byte.MAX_VALUE)
            {
                byte result = (byte)(data + 1);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too large to perform addition.");
            }
    
        }
};