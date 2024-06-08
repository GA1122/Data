class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                int x = (new SecureRandom()).nextInt();
                switch (x)
                {
                    /* FLAW: An empty case statement has no effect */
                case 0:
                    break;
                default:
                    IO.writeLine("Inside the default statement");
                    break;
                }
                IO.writeLine("Hello from bad()");
            }
            else
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