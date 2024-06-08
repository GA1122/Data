class bad_class{
    public void bad() throws Throwable
        {
            int countCopy;
            {
                int count;
    
                /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
                count = Integer.MAX_VALUE;
    
                countCopy = count;
            }
            {
                int count = countCopy;
    
                /* POTENTIAL FLAW: Use count as the input to Thread.sleep() */
                Thread.sleep(count);
    
            }
        }
};