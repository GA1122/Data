class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
            {
                /* FIX: Do not include semicolon (statement that has no effect) */
                IO.writeLine("Hello from good()");
            }
        }
};