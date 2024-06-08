class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                int i = 0;
                /* FLAW: An empty while statement has no effect */
                while(i++ < 10)
                {
                }
                IO.writeLine("Hello from bad()");
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