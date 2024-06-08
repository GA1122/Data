class bad_class{
    public void bad() throws Throwable
        {
            int count;
    
            while (true)
            {
                /* POTENTIAL FLAW: Set count to a random value */
                count = (new SecureRandom()).nextInt();
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