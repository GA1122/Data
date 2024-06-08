class bad_class{
    public void bad() throws Throwable
        {
            while(true)
            {
                /* FLAW: assertion is false */
                assert "".length() > 0;
                break;
            }
        }
};