class good1_class{
    private void good1() throws Throwable
        {
            switch (8)
            {
            case 7:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            default:
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
                break;
            }
        }
};