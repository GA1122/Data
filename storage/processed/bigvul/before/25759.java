class goodB2GSink_class{
    public void goodB2GSink(Vector<Long> dataVector ) throws Throwable
        {
            long data = dataVector.remove(2);
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* FIX: Add a check to prevent an overflow from occurring */
                if (data < (Long.MAX_VALUE/2))
                {
                    long result = (long)(data * 2);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too large to perform multiplication.");
                }
            }
    
        }
};