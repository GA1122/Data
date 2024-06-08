class bad_class{
    public void bad() throws Throwable
        {
            if (true)
            {
                /* FLAW: assertion is false */
                assert "".length() > 0;
            }
        }
};