class good2_class{
    private void good2() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                int x = (new SecureRandom()).nextInt();
                switch (x)
                {
                    /* FIX: Do not include an empty case statement */
                case 0:
                    IO.writeLine("Inside the case statement");
                    break;
                default:
                    IO.writeLine("Inside the default statement");
                    break;
                }
                IO.writeLine("Hello from good()");
            }
        }
};