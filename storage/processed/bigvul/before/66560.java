class bad_class{
    public void bad() throws Throwable
        {
            if (true)
            {
                /* FLAW: environment variable information exposed */
                IO.writeLine("Not in path: " + System.getenv("PATH"));
            }
        }
};