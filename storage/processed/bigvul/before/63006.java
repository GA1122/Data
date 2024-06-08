class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int count;
    
            while (true)
            {
                /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
                count = Integer.MAX_VALUE;
                break;
            }
    
            while (true)
            {
                /* FIX: Validate count before using it in a call to Thread.sleep() */
                if (count > 0 && count <= 2000)
                {
                    Thread.sleep(count);
                }
                break;
            }
        }
};