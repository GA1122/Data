class good2_class{
    private void good2() throws Throwable
        {
            if (IO.STATIC_FINAL_FIVE == 5)
            {
                /* FIX: Do not include an empty for statement */
                for (int i = 0; i < 10; i++)
                {
                    IO.writeLine("Inside the for statement");
                }
                IO.writeLine("Hello from good()");
            }
        }
};