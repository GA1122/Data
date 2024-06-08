class good2_class{
    private void good2() throws Throwable
        {
            switch (7)
            {
            case 7:
                try
                {
                    Integer.parseInt("Test"); /* Will throw NumberFormatException */
                }
                catch (NumberFormatException exceptNumberFormat) /* FIX: Catch NumberFormatException */
                {
                    IO.writeLine("Caught Exception");
                    throw exceptNumberFormat; /* Rethrow */
                }
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};