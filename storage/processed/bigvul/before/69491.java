class bad_class{
    public void bad() throws Throwable
        {
            for(int j = 0; j < 1; j++)
            {
                /* FLAW: assertion is false */
                assert "".length() > 0;
            }
        }
};