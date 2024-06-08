class goodB2GSink_class{
    private void goodB2GSink() throws Throwable
        {
            int count = countGoodB2G;
    
            /* FIX: Validate count before using it in a call to Thread.sleep() */
            if (count > 0 && count <= 2000)
            {
                Thread.sleep(count);
            }
    
        }
};