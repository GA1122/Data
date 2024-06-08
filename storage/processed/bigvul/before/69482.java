class good2_class{
    private void good2() throws Throwable
        {
            if (IO.STATIC_FINAL_FIVE == 5)
            {
                /* FIX: assertion is true */
                assert "cwe617".length() > 0;
            }
        }
};