class bad_class{
    public void bad() throws Throwable
        {
            if (5 == 5)
            {
                /* FLAW: environment variable information exposed */
                IO.writeLine("Not in path: " + System.getenv("PATH"));
            }
        }
};