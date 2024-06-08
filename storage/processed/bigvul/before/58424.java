class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Do not include semicolon (statement that has no effect) */
                IO.writeLine("Hello from good()");
            }
            else
            {
    
                /* FIX: Do not include semicolon (statement that has no effect) */
    
                IO.writeLine("Hello from good()");
    
            }
        }
};