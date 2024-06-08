class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
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
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};