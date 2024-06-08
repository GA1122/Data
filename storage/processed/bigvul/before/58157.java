class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
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