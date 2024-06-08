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
    
                int i = 0;
    
                /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
                for (i = 0; i < count; i++)
                {
                    IO.writeLine("Hello");
                }
    
            }
        }
};