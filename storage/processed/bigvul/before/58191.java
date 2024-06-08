class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
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