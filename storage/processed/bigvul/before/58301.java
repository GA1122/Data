class bad_class{
    public void bad() throws Throwable
        {
            if (true)
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