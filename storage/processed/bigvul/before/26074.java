class goodB2GSink_class{
    public void goodB2GSink(long dataArray[] ) throws Throwable
        {
            long data = dataArray[2];
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Long.MAX_VALUE)
            {
                long result = (long)(++data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too large to increment.");
            }
    
        }
};