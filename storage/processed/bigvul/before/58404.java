class good2_class{
    private void good2() throws Throwable
        {
            if (privateTrue)
            {
                /* FIX: Do not include semicolon (statement that has no effect) */
                IO.writeLine("Hello from good()");
            }
        }
};