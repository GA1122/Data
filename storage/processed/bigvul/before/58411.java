class bad_class{
    public void bad() throws Throwable
        {
            if (privateReturnsTrue())
            {
                ; /* FLAW: This semicolon is a statement that has no effect */
                IO.writeLine("Hello from bad()");
            }
        }
};