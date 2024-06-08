class good2_class{
    private void good2() throws Throwable
        {
            switch (7)
            {
            case 7:
                /* FIX: Include some code inside the block */
            {
                String sentence = "Inside the block"; /* Define a variable to justify having a block for scoping */
                IO.writeLine(sentence);
            }
            IO.writeLine("Hello from good()");
            break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};