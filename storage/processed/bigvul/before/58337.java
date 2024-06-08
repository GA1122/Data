class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticFive != 5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                int i = 0;
    
                /* FIX: Do not include an empty while statement */
                while(i++ < 10)
                {
                    IO.writeLine("Inside the while statement");
                }
    
                IO.writeLine("Hello from good()");
    
            }
        }
};