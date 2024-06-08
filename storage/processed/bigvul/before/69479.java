class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FIX: assertion is true */
                assert "cwe617".length() > 0;
            }
            else
            {
    
                /* FIX: assertion is true */
                assert "cwe617".length() > 0;
    
            }
        }
};