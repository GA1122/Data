class good2_class{
    private void good2() throws Throwable
        {
            if (IO.staticReturnsTrue())
            {
                /* FIX: error message is general */
                IO.writeLine("Not in path");
            }
        }
};