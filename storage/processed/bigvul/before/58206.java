class good1_class{
    private void good1() throws Throwable
        {
    
            /* FIX: Do not include an empty for statement */
            for (int i = 0; i < 10; i++)
            {
                IO.writeLine("Inside the for statement");
            }
    
            IO.writeLine("Hello from good()");
    
        }
};