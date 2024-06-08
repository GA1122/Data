class bad_class{
    public void bad() throws Throwable
        {
            while(true)
            {
                ; /* FLAW: This semicolon is a statement that has no effect */
                IO.writeLine("Hello from bad()");
                break;
            }
        }
};