class goodB2GSink_class{
    public void goodB2GSink(Vector<Long> dataVector ) throws Throwable
        {
            long data = dataVector.remove(2);
    
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