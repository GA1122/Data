class good1_class{
    private void good1() throws Throwable
        {
            while(true)
            {
                /* FIX: assertion is true */
                assert "cwe617".length() > 0;
                break;
            }
        }
};