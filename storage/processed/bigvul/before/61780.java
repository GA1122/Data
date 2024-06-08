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
    
                int i = 0;
    
                /* FIX: Validate count before using it as the for loop variant */
                if (count > 0 && count <= 20)
                {
                    for (i = 0; i < count; i++)
                    {
                        IO.writeLine("Hello");
                    }
                }
    
            }
        }
};