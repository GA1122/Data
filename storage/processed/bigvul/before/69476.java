class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticReturnsFalse())
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: assertion is true */
                assert "cwe617".length() > 0;
    
            }
        }
};