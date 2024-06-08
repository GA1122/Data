class good1_class{
    private void good1() throws Throwable
        {
            if (5 != 5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: error message is general */
                IO.writeLine("Not in path");
    
            }
        }
};