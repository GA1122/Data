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
                int i = 0;
                /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
                for (i = 0; i < count; i++)
                {
                    IO.writeLine("Hello");
                }
                break;
            }
        }
};