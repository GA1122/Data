class good2_class{
    private void good2() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_FIVE == 5)
            {
                int x;
                x = (new SecureRandom()).nextInt();
                if (x == 0)
                {
                    IO.writeLine("Inside the if statement");
                }
                /* FIX: Do not include an empty else statement */
                else
                {
                    IO.writeLine("Inside the else statement");
                }
                IO.writeLine("Hello from good()");
            }
        }
};