class goodB2GSink_class{
    public void goodB2GSink(HashMap<Integer,Long> dataHashMap ) throws Throwable
        {
            long data = dataHashMap.get(2);
    
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