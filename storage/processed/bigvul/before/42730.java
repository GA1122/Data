class goodB2GSink_class{
    public void goodB2GSink(HashMap<Integer,Short> dataHashMap ) throws Throwable
        {
            short data = dataHashMap.get(2);
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data > Short.MIN_VALUE)
            {
                short result = (short)(data - 1);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to perform subtraction.");
            }
    
        }
};