class bad_class{
    public void bad() throws Throwable
        {
            for(int j = 0; j < 1; j++)
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
        }
};