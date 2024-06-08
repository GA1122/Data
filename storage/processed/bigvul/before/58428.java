class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticFive == 5)
            {
                ; /* FLAW: This semicolon is a statement that has no effect */
                IO.writeLine("Hello from bad()");
            }
        }
};