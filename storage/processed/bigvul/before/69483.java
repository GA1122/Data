class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticFive == 5)
            {
                /* FLAW: assertion is false */
                assert "".length() > 0;
            }
        }
};