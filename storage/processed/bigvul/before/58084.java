class bad_class{
    public void bad() throws Throwable
        {
            if (privateReturnsTrue())
            {
                /* FLAW: The empty block on the next line has no effect */
                {
                }
                IO.writeLine("Hello from bad()");
            }
        }
};