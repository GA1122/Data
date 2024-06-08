class bad_class{
    public void bad() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                /* FLAW: environment variable information exposed */
                IO.writeLine("Not in path: " + System.getenv("PATH"));
            }
        }
};