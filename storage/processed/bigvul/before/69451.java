class bad_class{
    public void bad() throws Throwable
        {
            if (5 == 5)
            {
                /* FLAW: assertion is false */
                assert "".length() > 0;
            }
        }
};