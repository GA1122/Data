class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int countCopy;
            {
                int count;
    
                /* POTENTIAL FLAW: Set count to a random value */
                count = (new SecureRandom()).nextInt();
    
                countCopy = count;
            }
            {
                int count = countCopy;
    
                /* FIX: Validate count before using it in a call to Thread.sleep() */
                if (count > 0 && count <= 2000)
                {
                    Thread.sleep(count);
                }
    
            }
        }
};