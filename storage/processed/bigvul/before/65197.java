class goodB2GSink_class{
    public void goodB2GSink(HashMap<Integer,Integer> dataHashMap ) throws Throwable
        {
            Integer data = dataHashMap.get(2);
    
            /* FIX: validate that data is non-null */
            if (data != null)
            {
                IO.writeLine("" + data.toString());
            }
            else
            {
                IO.writeLine("data is null");
            }
    
        }
};