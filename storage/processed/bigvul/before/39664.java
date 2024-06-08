class goodB2GSink_class{
    public void goodB2GSink(HashMap<Integer,Long> dataHashMap ) throws Throwable
        {
            long data = dataHashMap.get(2);
    
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