class good2_class{
    private void good2() throws Throwable
        {
            switch (7)
            {
            case 7:
                /* FIX: Do not include an empty for statement */
                for (int i = 0; i < 10; i++)
                {
                    IO.writeLine("Inside the for statement");
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