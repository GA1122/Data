class goodB2GSink_class{
    public void goodB2GSink(HashMap<Integer,Byte> dataHashMap ) throws Throwable
        {
            byte data = dataHashMap.get(2);
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data > (Byte.MIN_VALUE/2))
                {
                    byte result = (byte)(data * 2);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to perform multiplication.");
                }
            }
    
        }
};