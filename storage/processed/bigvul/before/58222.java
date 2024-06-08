class bad_class{
    public void bad() throws Throwable
        {
            if (privateFive == 5)
            {
                /* FLAW: An empty for statement has no effect */
                for (int i = 0; i < 10; i++)
                {
                }
                IO.writeLine("Hello from bad()");
            }
        }
};