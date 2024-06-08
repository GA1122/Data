class good2_class{
    private void good2() throws Throwable
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
                    /* FIX: cleanup code here and continue */
                    IO.writeLine("In finally block, cleaning up");
                }
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};