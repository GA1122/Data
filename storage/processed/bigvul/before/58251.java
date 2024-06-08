class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
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