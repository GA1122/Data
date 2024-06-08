class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FLAW: The empty block on the next line has no effect */
                {
                }
                IO.writeLine("Hello from bad()");
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