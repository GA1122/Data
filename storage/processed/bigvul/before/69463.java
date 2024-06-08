class bad_class{
    public void bad() throws Throwable
        {
            if (privateFive == 5)
            {
                /* FLAW: assertion is false */
                assert "".length() > 0;
            }
        }
};