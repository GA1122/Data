class goodB2GSink_class{
    public void goodB2GSink(HashMap<Integer,Integer> countHashMap ) throws Throwable
        {
            int count = countHashMap.get(2);
    
            /* FIX: Validate count before using it in a call to Thread.sleep() */
            if (count > 0 && count <= 2000)
            {
                Thread.sleep(count);
            }
    
        }
};