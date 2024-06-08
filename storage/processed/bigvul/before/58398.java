class good2_class{
    private void good2() throws Throwable
        {
            if (5 == 5)
            {
                /* FIX: Do not include semicolon (statement that has no effect) */
                IO.writeLine("Hello from good()");
            }
        }
};