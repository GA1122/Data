class bad_class{
    public void bad() throws Throwable
        {
            if (5 == 5)
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