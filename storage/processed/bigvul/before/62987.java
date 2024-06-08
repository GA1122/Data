class bad_class{
    public void bad() throws Throwable
        {
            int count;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
                count = Integer.MAX_VALUE;
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                count = 2;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Use count as the input to Thread.sleep() */
                Thread.sleep(count);
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