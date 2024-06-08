class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticTrue)
            {
                /* FLAW: assertion is false */
                assert "".length() > 0;
            }
        }
};