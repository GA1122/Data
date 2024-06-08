class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                ; /* FLAW: This semicolon is a statement that has no effect */
                IO.writeLine("Hello from bad()");
            }
            else
            {
    
                /* FIX: Do not include semicolon (statement that has no effect) */
    
                IO.writeLine("Hello from good()");
    
            }
        }
};