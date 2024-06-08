class goodB2GSink_class{
    public void goodB2GSink(Vector<Long> dataVector ) throws Throwable
        {
            long data = dataVector.remove(2);
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data > (Long.MIN_VALUE/2))
                {
                    long result = (long)(data * 2);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to perform multiplication.");
                }
            }
    
        }
};