class bad_class{
    public void bad() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_FIVE == 5)
            {
                /* FLAW: assertion is false */
                assert "".length() > 0;
            }
        }
};