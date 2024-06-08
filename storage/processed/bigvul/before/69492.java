class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
            {
                /* FIX: assertion is true */
                assert "cwe617".length() > 0;
            }
        }
};