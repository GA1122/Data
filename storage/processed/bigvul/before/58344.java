class bad_class{
    public void bad() throws Throwable
        {
            for(int j = 0; j < 1; j++)
            {
                int i = 0;
                /* FLAW: An empty while statement has no effect */
                while(i++ < 10)
                {
                }
                IO.writeLine("Hello from bad()");
            }
        }
};