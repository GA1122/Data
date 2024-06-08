class good2_class{
    private void good2() throws Throwable
        {
            switch (7)
            {
            case 7:
                /* FIX: error message is general */
                IO.writeLine("Not in path");
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};