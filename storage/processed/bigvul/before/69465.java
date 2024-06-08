class good2_class{
    private void good2() throws Throwable
        {
            if (privateFive == 5)
            {
                /* FIX: assertion is true */
                assert "cwe617".length() > 0;
            }
        }
};