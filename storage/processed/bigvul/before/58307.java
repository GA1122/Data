class bad_class{
    public void bad() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_TRUE)
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