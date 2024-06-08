class bad_class{
    public void bad() throws Throwable
        {
            if (privateTrue)
            {
                /* FLAW: assertion is false */
                assert "".length() > 0;
            }
        }
};