class bad_class{
    public void bad() throws Throwable
        {
            int count;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * count is uninitialized
             */
    
            /* POTENTIAL FLAW: Set count to a random value */
            count = (new SecureRandom()).nextInt();
    
            for (int j = 0; j < 1; j++)
            {
                /* POTENTIAL FLAW: Use count as the input to Thread.sleep() */
                Thread.sleep(count);
            }
        }
};