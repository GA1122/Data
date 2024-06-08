class good1_class{
    private void good1() throws Throwable
        {
            while(true)
            {
                int i = 0;
                /* FIX: Do not include an empty while statement */
                while(i++ < 10)
                {
                    IO.writeLine("Inside the while statement");
                }
                IO.writeLine("Hello from good()");
                break;
            }
        }
};