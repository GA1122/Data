class goodB2GSink_class{
    public void goodB2GSink(HashMap<Integer,StringBuilder> dataHashMap ) throws Throwable
        {
            StringBuilder data = dataHashMap.get(2);
    
            /* FIX: validate that data is non-null */
            if (data != null)
            {
                IO.writeLine("" + data.length());
            }
            else
            {
                IO.writeLine("data is null");
            }
    
        }
};