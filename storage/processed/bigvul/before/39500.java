class goodB2GSink_class{
    public void goodB2GSink(Object dataObject ) throws Throwable
        {
            long data = (Long)dataObject;
    
            /* FIX: Add a check to prevent an underflow from occurring */
            if (data > Long.MIN_VALUE)
            {
                long result = (long)(--data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to decrement.");
            }
    
        }
};