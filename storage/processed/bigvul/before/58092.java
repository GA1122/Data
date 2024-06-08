class good2_class{
    private void good2() throws Throwable
        {
            if (IO.staticTrue)
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