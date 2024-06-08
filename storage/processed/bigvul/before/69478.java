class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FLAW: assertion is false */
                assert "".length() > 0;
            }
            else
            {
    
                /* FIX: assertion is true */
                assert "cwe617".length() > 0;
    
            }
        }
};