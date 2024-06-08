class good2_class{
    private void good2() throws Throwable
        {
            if (true)
            {
                int i = 0;
                /* FIX: Do not include an empty while statement */
                while(i++ < 10)
                {
                    IO.writeLine("Inside the while statement");
                }
                IO.writeLine("Hello from good()");
            }
        }
};