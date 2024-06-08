class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FLAW: An empty for statement has no effect */
                for (int i = 0; i < 10; i++)
                {
                }
                IO.writeLine("Hello from bad()");
            }
            else
            {
    
                /* FIX: Do not include an empty for statement */
                for (int i = 0; i < 10; i++)
                {
                    IO.writeLine("Inside the for statement");
                }
    
                IO.writeLine("Hello from good()");
    
            }
        }
};