class bad_class{
    public void bad() throws Throwable
        {
            for(int j = 0; j < 1; j++)
            {
                /* FLAW: environment variable information exposed */
                IO.writeLine("Not in path: " + System.getenv("PATH"));
            }
        }
};