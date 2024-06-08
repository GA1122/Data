class bad_class{
    public void bad() throws Throwable
        {
            if (privateFive == 5)
            {
                /* FLAW: environment variable information exposed */
                IO.writeLine("Not in path: " + System.getenv("PATH"));
            }
        }
};