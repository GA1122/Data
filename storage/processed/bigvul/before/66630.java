class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticFalse)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: don't have those types of comments :) */
                IO.writeLine("This a test of the emergency broadcast system");
    
            }
        }
};