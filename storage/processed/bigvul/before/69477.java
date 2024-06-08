class good2_class{
    private void good2() throws Throwable
        {
            if (IO.staticReturnsTrue())
            {
                /* FIX: assertion is true */
                assert "cwe617".length() > 0;
            }
        }
};