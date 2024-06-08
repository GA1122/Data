class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                int x;
                x = (new SecureRandom()).nextInt();
                /* FLAW: An empty if statement has no effect */
                if (x == 0)
                {
                }
                else
                {
                    IO.writeLine("Inside the else statement");
                }
                IO.writeLine("Hello from bad()");
            }
            else
            {
    
                int x;
    
                x = (new SecureRandom()).nextInt();
    
                /* FIX: Do not include an empty if statement */
                if (x == 0)
                {
                    IO.writeLine("Inside the if statement");
                }
                else
                {
                    IO.writeLine("Inside the else statement");
                }
    
                IO.writeLine("Hello from good()");
    
            }
        }
};