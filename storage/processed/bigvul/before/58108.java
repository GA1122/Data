class good1_class{
    private void good1() throws Throwable
        {
            while(true)
            {
                /* FIX: Include some code inside the block */
                {
                    String sentence = "Inside the block"; /* Define a variable to justify having a block for scoping */
                    IO.writeLine(sentence);
                }
                IO.writeLine("Hello from good()");
                break;
            }
        }
};