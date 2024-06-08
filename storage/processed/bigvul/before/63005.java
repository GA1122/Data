class bad_class{
    public void bad() throws Throwable
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
                /* POTENTIAL FLAW: Use count as the input to Thread.sleep() */
                Thread.sleep(count);
                break;
            }
        }
};