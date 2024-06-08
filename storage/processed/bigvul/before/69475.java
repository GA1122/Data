class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrue())
            {
                /* FLAW: assertion is false */
                assert "".length() > 0;
            }
        }
};