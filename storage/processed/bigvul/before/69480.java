class bad_class{
    public void bad() throws Throwable
        {
            if (IO.STATIC_FINAL_FIVE == 5)
            {
                /* FLAW: assertion is false */
                assert "".length() > 0;
            }
        }
};