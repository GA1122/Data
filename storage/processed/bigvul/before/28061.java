class goodB2GSink_class{
    public void goodB2GSink(HashMap<Integer,Short> dataHashMap ) throws Throwable
        {
            short data = dataHashMap.get(2);
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* FIX: Add a check to prevent an overflow from occurring */
                if (data < (Short.MAX_VALUE/2))
                {
                    short result = (short)(data * 2);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too large to perform multiplication.");
                }
            }
    
        }
};