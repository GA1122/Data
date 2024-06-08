class bad_class{
    public void bad() throws Throwable
        {
            while(true)
            {
                /* FLAW: environment variable information exposed */
                IO.writeLine("Not in path: " + System.getenv("PATH"));
                break;
            }
        }
};