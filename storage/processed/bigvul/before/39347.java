class goodB2GSink_class{
    public void goodB2GSink(Vector<Long> dataVector ) throws Throwable
        {
            long data = dataVector.remove(2);
    
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