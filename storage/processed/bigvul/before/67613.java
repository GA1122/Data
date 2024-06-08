class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                try
                {
                    throw new IllegalArgumentException();
                }
                catch(IllegalArgumentException exceptIllegalArgument)
                {
                    IO.writeLine("preventing incidental issues");
                }
                finally
                {
                    if(true)
                    {
                        return; /* FLAW: will always return and prevent finally from completing normally */
                    }
                    /* INCIDENTAL: 571 Always returns true */
                    /* We need the "if(true)" above because the Java Language Spec requires that unreachable code generate a compiler error */
                }
            }
            else
            {
    
                try
                {
                    throw new IllegalArgumentException();
                }
                catch(IllegalArgumentException exceptIllegalArgument)
                {
                    IO.writeLine("preventing incidental issues");
                }
                finally
                {
                    /* FIX: cleanup code here and continue */
                    IO.writeLine("In finally block, cleaning up");
                }
    
            }
        }
};