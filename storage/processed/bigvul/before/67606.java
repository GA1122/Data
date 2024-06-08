class good2_class{
    private void good2() throws Throwable
        {
            if (IO.STATIC_FINAL_TRUE)
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