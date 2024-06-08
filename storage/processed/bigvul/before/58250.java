class bad_class{
    public void bad() throws Throwable
        {
            for(int j = 0; j < 1; j++)
            {
                /* FLAW: An empty for statement has no effect */
                for (int i = 0; i < 10; i++)
                {
                }
                IO.writeLine("Hello from bad()");
            }
        }
};