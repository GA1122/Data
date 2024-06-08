class goodB2GSink_class{
    public void goodB2GSink(Object dataObject ) throws Throwable
        {
            long data = (Long)dataObject;
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data > Long.MIN_VALUE)
            {
                long result = (long)(data - 1);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to perform subtraction.");
            }
    
        }
};