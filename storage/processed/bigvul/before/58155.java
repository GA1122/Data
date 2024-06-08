class good1_class{
    private void good1() throws Throwable
        {
            while(true)
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
                break;
            }
        }
};