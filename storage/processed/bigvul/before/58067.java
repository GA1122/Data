class good1_class{
    private void good1() throws Throwable
        {
            if (false)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: Include some code inside the block */
                {
                    String sentence = "Inside the block"; /* Define a variable to justify having a block for scoping */
                    IO.writeLine(sentence);
                }
    
                IO.writeLine("Hello from good()");
    
            }
        }
};