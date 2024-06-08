class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FLAW: environment variable information exposed */
                IO.writeLine("Not in path: " + System.getenv("PATH"));
            }
            else
            {
    
                /* FIX: error message is general */
                IO.writeLine("Not in path");
    
            }
        }
};