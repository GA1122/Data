class good1_class{
    private void good1() throws Throwable
        {
            if (false)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
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