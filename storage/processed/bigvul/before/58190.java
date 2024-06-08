class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                int x;
                x = (new SecureRandom()).nextInt();
                if (x == 0)
                {
                    IO.writeLine("Inside the else statement");
                }
                /* FLAW: An empty else statement has no effect */
                else
                {
                }
                IO.writeLine("Hello from bad()");
            }
            else
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