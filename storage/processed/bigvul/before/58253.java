class good1_class{
    private void good1() throws Throwable
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
};