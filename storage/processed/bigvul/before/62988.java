class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int count;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
                count = Integer.MAX_VALUE;
            }
            else
            {
    
                /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
                count = Integer.MAX_VALUE;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Validate count before using it in a call to Thread.sleep() */
                if (count > 0 && count <= 2000)
                {
                    Thread.sleep(count);
                }
            }
            else
            {
    
                /* FIX: Validate count before using it in a call to Thread.sleep() */
                if (count > 0 && count <= 2000)
                {
                    Thread.sleep(count);
                }
    
            }
        }
};