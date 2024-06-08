class bad_class{
    public void bad() throws Throwable
        {
            if (privateFive == 5)
            {
                /* FLAW: The empty block on the next line has no effect */
                {
                }
                IO.writeLine("Hello from bad()");
            }
        }
};