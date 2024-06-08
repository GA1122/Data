class goodB2GSink_class{
    public void goodB2GSink(long dataArray[] ) throws Throwable
        {
            long data = dataArray[2];
    
            /* FIX: Add a check to prevent an underflow from occurring */
            if (data > Long.MIN_VALUE)
            {
                data--;
                long result = (long)(data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to decrement.");
            }
    
        }
};