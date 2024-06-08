class goodB2GSink_class{
    public void goodB2GSink(Object countObject ) throws Throwable
        {
            int count = (Integer)countObject;
    
            /* FIX: Validate count before using it in a call to Thread.sleep() */
            if (count > 0 && count <= 2000)
            {
                Thread.sleep(count);
            }
    
        }
};